package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {

	//GEt
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String xxx() { 
		return "loginForm";
	}
	
	
	//POST
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String ttt(Login dto ) {
		System.out.println("출력>>>>>>"+dto);
		return "login3";
	}
	
	//POST
	@RequestMapping(value="/login3" , method=RequestMethod.POST)
	public String ttt3(@ModelAttribute("xxx") Login dto ) {
		return "login2";
	}
	
	//POST
	@RequestMapping(value="/login2" , method=RequestMethod.POST)
	public ModelAndView ttt8( Login dto ) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginDTO", dto);
		mav.setViewName("login");
		System.out.println(dto);
		return mav;
	}

	
}





