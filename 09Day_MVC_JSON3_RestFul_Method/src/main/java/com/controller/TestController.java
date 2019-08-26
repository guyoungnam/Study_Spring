package com.controller;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value="/board", method=RequestMethod.GET)
	public String aaa() {
		System.out.println("GET");
		return "main";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.POST)
	public String aaa2() {
		System.out.println("POST");
		return "main";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.PUT)
	public String aaa3() {
		System.out.println("PUT");
		return "main";
	}
	
	@RequestMapping(value="/board", method=RequestMethod.DELETE)
	public String aaa4() {
		System.out.println("DELETE");
		return "main";
	}


	}

