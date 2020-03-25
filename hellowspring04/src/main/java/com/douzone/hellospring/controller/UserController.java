package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 * 	RequestMapping
 * 	Class + Method
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = {"/join", "/j"}, method=RequestMethod.GET)  //jsp나 특별한 경로 설정 없이 매핑가능, 메소드를 통해 GET방식 선언
	public String join() {
		return "join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo userVo) {
		System.out.println(userVo);
//		userRepository.insert(userVo);
		return "redirect:/";
	}
	
	/**
	 * @RequestParam이 필요할 때, 데이터가 n이라는 변수로 넘어와야 할 때(평소에는 생략 중)
	 * 	만일 n이라는 이름으로 파라미터가 없는 경우 400 Bad Request 오류 발생
	 */
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam("n") String name) {
		System.out.println(name);
		return "UserController:update";
	}
	
	// 위에 처럼 파라미터가 없어도 에러 없이 실행가능
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(
		@RequestParam(value="n", required=true, defaultValue="") String name,
		@RequestParam(value="a", required=true, defaultValue="") int age){
		System.out.println("----" + name + "-----" + age + "------");
		return "UserController:update2";
	}
}
