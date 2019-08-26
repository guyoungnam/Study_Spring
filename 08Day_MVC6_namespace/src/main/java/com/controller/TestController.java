package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;


@Controller
public class TestController {
	
	@RequestMapping("/aaa")
	@ResponseBody
	public Login aaa() {
		Login login = new Login();
		login.setUserid("홍길동");
		login.setPasswd("1234");
		return login;
	}



}





