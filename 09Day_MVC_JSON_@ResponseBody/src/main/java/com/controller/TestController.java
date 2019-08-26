package com.controller;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
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
	
	
	@RequestMapping("/bbb")
	@ResponseBody
	public ArrayList<Login> bbb(){
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동","20"));
		list.add(new Login("홍길동2","30"));
		list.add(new Login("홍길동3","40"));
		return list;
	}
	
	@RequestMapping("ccc")
	@ResponseBody
	public HashMap<String, ArrayList<Login>> ccc(){
		HashMap<String, ArrayList<Login>> map = new HashMap<String, ArrayList<Login>>();
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동","20"));
		list.add(new Login("홍길동2","30"));
		list.add(new Login("홍길동3","40"));
		ArrayList<Login> list2 = new ArrayList<Login>();
		list2.add(new Login("유관순","20"));
		list2.add(new Login("유관순2","30"));
		list2.add(new Login("유관순3","40"));
		
		return map;
	}


}





