package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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

	    @ModelAttribute("xxx")
	    public ArrayList<String> getList(){
	    	System.out.println("getList()");
	    	ArrayList<String> list = new ArrayList<String>();
	    	list.add("홍길동1");
			list.add("홍길동2");
			list.add("홍길동3");
			list.add("홍길동4");
			return list;
	    }
	
		@RequestMapping(value="/aaa" , method=RequestMethod.GET)
		public String xxx3(@ModelAttribute("xxx") ArrayList<String> list) { 
	
			System.out.println("aaa 요청추가 작업");
			return "main";
		}
		
		@RequestMapping(value="/bbb" , method=RequestMethod.GET)
		public String bbb(@ModelAttribute("xxx") ArrayList<String> list) { 

			
			System.out.println("bbb 요청추가 작업");
			return "main2";
		}
		
	

	
}





