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

	
	//GEt
	@RequestMapping(value="/ccc" , method=RequestMethod.GET)
	public String ccc(ArrayList<String> list) {  //${stringList}
		
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		
		return "main3";
	}
	
	//GEt
		@RequestMapping(value="/bbb" , method=RequestMethod.GET)
		public String xxx3(@ModelAttribute("xxx") ArrayList<String> list) { 
			
			list.add("홍길동1");
			list.add("홍길동2");
			list.add("홍길동3");
			list.add("홍길동4");
			
			
			return "main2";
		}
		
	//GEt
	@RequestMapping(value="/aaa" , method=RequestMethod.GET)
	public ModelAndView xxx(ArrayList<String> list) { 
		
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("main");
		return mav;
	}
	
	

	
}





