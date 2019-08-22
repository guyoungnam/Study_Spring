package com.controller;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	

	@RequestMapping("/setCookie")
	public String xxx(HttpServletRequest request, HttpServletResponse response) {
          Cookie c = new Cookie("myName", "홍길동");
        		  c.setMaxAge(60*60);
        		  response.addCookie(c);
		return "main";
	}
	
	@RequestMapping("/getCookie")
	public String xxx2(HttpServletRequest request){
		Cookie [] cookie = request.getCookies();
		for(Cookie c: cookie) {
			if(c.getName().contentEquals("myName")){
			System.out.println(c.getName()+"="+c.getValue());		
		}
		}
		return "main";
	}
		
		@RequestMapping("/getCookie2")
		public String xxx3(@CookieValue("myName") String m){

			System.out.println(m);		
			return "main";
		}


	}

