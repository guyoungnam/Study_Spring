package com.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	

	@RequestMapping("/kkk")
	public String xxx(HttpServletRequest request) {
		Enumeration<String> keys = request.getHeaderNames();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = request.getHeader(key);
			
			System.out.println("요청"+key+"요청"+value);
		}
		
		
		return "main";
	}
	
	@RequestMapping("/yyy")
	public String xxx2(@RequestHeader("user-agent") String x,
		@RequestHeader("host") String x2){
		System.out.println("요청"+x+x2);
		return "main";
	}

}
