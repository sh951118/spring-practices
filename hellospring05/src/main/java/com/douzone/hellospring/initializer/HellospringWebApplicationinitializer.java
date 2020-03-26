package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HellospringWebApplicationinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Root Application Context 설정 클래스
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		// new Object[] {Book.class, Proudect} 이것처럼 아래에 쓴 것
		// Web Application Context 설정 클래스
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// 서블릿 매핑
		return new String[] {"/"};
	}

}
