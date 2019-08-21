package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	// http://ip번호:포트번호/컨테스트명 / 서블릿매핑 / request맵핑
	// http://localhost:8090/app/kkk
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String xxx() {
		System.out.println("loginform 요청");
		return "loginForm";
	}
	
	// http://localhost:8090/app/yyy
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String xxx2() {
		System.out.println("login 요청");
		return "login";
	}

}
