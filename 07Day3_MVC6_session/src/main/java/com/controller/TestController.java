package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String login( Login dto, HttpSession session ) {
		//로그인 체크하고..
		
		session.setAttribute("login", dto);
		return "login";
	}
	
	@RequestMapping(value="/logout" , method=RequestMethod.POST)
	public String logout(HttpSession session ) {
		
		session.invalidate();
		return "redirect:login";
	}
	
	}





