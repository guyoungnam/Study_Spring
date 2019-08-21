package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	

	
	@RequestMapping(value="/")
	public String xxx() {
		System.out.println("main 요청");
		return "main";
	}
	
	@RequestMapping(value="/kkk", params="aaa=bbb")
	public String kkk() {
		System.out.println("A 호출");
		return "login";
	}
	
	@RequestMapping(value="/kkk", params="aaa=ccc")
	public String kkk2() {
		System.out.println("B 호출");
		return "login";
	}

	// params = "!zzz"
	// ?xxx=아무거나
	@RequestMapping(value="/kkk", params="xxx")
	public String kkk3() {
		System.out.println("C 호출");
		return "login";
	}

}
