package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	// http://ip번호:포트번호/컨테스트명 / 서블릿매핑 / request맵핑
	// http://localhost:8090/app/kkk
	
	@RequestMapping("/kkk")
	public String xxx() {
		System.out.println("kkk 요청");
		return "/WEB-INF/views/main.jsp";
	}
	
	@RequestMapping("/yyy")
	public String xxx2() {
		System.out.println("yyy 요청");
		return "/WEB-INF/views/main.jsp";
	}

}
