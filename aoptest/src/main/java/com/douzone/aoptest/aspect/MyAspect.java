package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("--- before Advice ---");
	}
	
	@After("execution(* *..*.service.ProductService.*(..))")
	public void afterAdvice() {
		System.out.println("--- after Advice ---");
	}
	
	@AfterReturning("execution(* *..*.service.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("--- afterReturning Advice ---");
	}
	
	@AfterThrowing(value="execution(* *..*.service.ProductService.*(..))", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("--- afterThrowing Advice : " + ex + "---");
	}
	
	/**
	 * 
	 * Around 많이 사용 
	 * xml에 꼭 <aop:aspectj-autoproxy />를 달아 주어야 함
	 * 또한 execution(* *..*.service.ProductService.*(..)) *기술 잘 사용하기
	 * *가 모든 경로를 포함
	 * 즉, com.douzone / *(com 외에도 모든 경로).douzone 이란 말.
	 * 
	 */
	@Around(value="execution(* *..*.service.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		//before advice
		System.out.println("Around(before) Advice");
		
		//PointCut Method 실행
		//파라미터 가로채기(바꿔버리기)
		//Object[] params = {"Camera"};
		//Object result = pjp.proceed(params);
		Object result = pjp.proceed();
		
		//after advice
		System.out.println("Around(after) Advice");
		
		return result;
	}
}
