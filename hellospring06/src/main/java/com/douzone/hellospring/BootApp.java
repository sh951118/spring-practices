package com.douzone.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 밑의 어노테이션이 붙어있는 경우 하위와 package를 맞춰준다.
// ex) com.douzone.hellospring에 @SpringBootApplication이 있을 경우,
// 	   com.douzone.hellospring.controller식으로 이름 맞추기!
@SpringBootApplication
public class BootApp {

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}
}
