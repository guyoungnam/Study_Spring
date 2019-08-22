package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Login;


public class TestController {

	    //1. 리턴타입 : String ==> 뷰만 알려줌, Model 없거나 유추

		@RequestMapping(value="/aaa" , method=RequestMethod.GET)
		public String xxx3(Model m) { 
			m.addAttribute("username","홍길동");

			return "main";
		}
		
		
		//2. ModelAndView ==> Model 과 뷰(view) 모두 알려줌
		@RequestMapping(value="/bbb" , method=RequestMethod.GET)
		public ModelAndView bbb() { 
			ModelAndView mav = new ModelAndView();
			mav.addObject("username", "홍길동");
			mav.setViewName("main2");
			return mav;
		}
		
		//3. 리턴 타입 : String => 모델만 알려줌, View 유추(ccc.jsp)
		
		@RequestMapping(value="/ccc" , method=RequestMethod.GET)
		public Login ccc() { 
			Login d = new Login();
			d.setUserid("aaa");;
			d.setPasswd("122");
			return d;
		}
		
		//4. 리턴 타입 : DTO => 모델만 알려줌, View 유추(ddd.jsp)
		
		@RequestMapping(value="/ddd" , method=RequestMethod.GET)
		@ModelAttribute("xxx")
		public Login ddd() { 
			Login d = new Login();
			d.setUserid("aaa");;
			d.setPasswd("122");
			return d;
		}
		
	//4. 리턴 타입 : ArrayList => 모델만 알려줌, View 유추(eee.jsp)
		
		@RequestMapping(value="/eee" , method=RequestMethod.GET)
		@ModelAttribute("xxx")
		public ArrayList<String> eee() { 
		      ArrayList<String> list = new ArrayList<String>();
		      list.add("A1");
		      list.add("A2");
		      list.add("A3");
			
			return list;
		}
		
	//5.void ==> 모델과 뷰 모두 안알려줌 , View : fff.jsp 모델 없음
		
		@RequestMapping(value="/fff" , method=RequestMethod.GET)
		public void fff() { 
		    System.out.println("fff");
		}
	

	
}





