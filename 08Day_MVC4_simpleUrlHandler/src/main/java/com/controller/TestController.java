package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TestController {
	
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String main() { 
		System.out.println("TestController 호출");
		return "main";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String main2() { 
		System.out.println("TestController2 호출");
		return "main";
	}
	




}





