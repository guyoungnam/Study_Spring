package com.controller;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	

	@RequestMapping("/aaa")
	public String xxx() {

		return "main";
	}
	
	@RequestMapping("/bbb")
	public ModelAndView xxx2(){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("username","홍길동");
		mav.addObject("age",20);
		mav.setViewName("main2"); // /WEB-INF/views/main2.jsp
		
		return mav;
	}
		
		@RequestMapping("/getCookie2")
		public String xxx3(@CookieValue("myName") String m){

			return "main";
		}


	}

