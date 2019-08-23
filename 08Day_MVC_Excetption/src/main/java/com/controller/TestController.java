package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TestController {

	//GEt
	@RequestMapping(value="/aaa" , method=RequestMethod.GET)
	public String xxx() { 
		if(true)throw new ArithmeticException("error 발생1");
		return "main";
	}
	
	@RequestMapping(value="/bbb" , method=RequestMethod.GET)
	public String bbb() { 
		if(true)throw new NullPointerException("error 발생2");
		return "main";
	}
	
  @ExceptionHandler({ArithmeticException.class,NullPointerException.class})
  public String errorPage() {
	  return "error";
  }

}





