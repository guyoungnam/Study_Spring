package com.controller;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Login;


@Controller
public class TestController {
	
	@RequestMapping("/aaa")
	public String aaa(@RequestBody Login login) {
		System.out.println(login);
		return "hello";
	}
	
	@RequestMapping("/bbb")
	public String bbb(@RequestBody ArrayList<Login> list) {
		System.out.println(list);
		return "hello";
	}
	
	
}
	









