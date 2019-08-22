package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	public String ttt8(Login dto ) {
		System.out.println(dto);
		return "login";
	}

	
}





