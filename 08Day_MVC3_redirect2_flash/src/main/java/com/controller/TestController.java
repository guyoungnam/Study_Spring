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
	
	
	
	
	@RequestMapping(value="/main" , method=RequestMethod.GET)
	public String main() { 
		System.out.println("main 호출");
		return "main";
	}
	
	//redirect
	@RequestMapping(value="/redirect" , method=RequestMethod.GET)
	public String redirect(RedirectAttributes m) { 
		System.out.println("redirect 호출");
		m.addFlashAttribute("userid", "홍길동1");
		return "redirect:main";
	}
	




}





