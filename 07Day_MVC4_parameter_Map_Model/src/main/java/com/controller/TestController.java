package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import javax.print.DocFlavor.STRING;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;

@Controller
public class TestController {

	    //@ModelAttribute 사용 안됨, 자동으로 모델로 처리

		@RequestMapping(value="/aaa" , method=RequestMethod.GET)
		public String xxx3(Model m) { 
			m.addAttribute("username","홍길동");

			return "main";
		}
		
		@RequestMapping(value="/bbb" , method=RequestMethod.GET)
		public String bbb(Map<String, String> map) { 
			map.put("address", "서울");

			return "main2";
		}
		
	

	
}





