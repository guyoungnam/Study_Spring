package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping(value="/board/name/{xxx}", method=RequestMethod.GET )
	public String aaa(@PathVariable("xxx") String name) {
		System.out.println(name);
		return "main";
	}
	@RequestMapping(value="/board2/name/{xxx}/age/{yyy}", method=RequestMethod.GET )
	public String aaa2(@PathVariable("xxx") String name ,
			          @PathVariable("yyy") int age) {
		System.out.println(name+"\t"+ age);
		return "main";
	}
	@RequestMapping(value="/board3/birthday/{xxx}", method=RequestMethod.GET )
	public String aaa3(@PathVariable("xxx") 
	                 @DateTimeFormat(iso = ISO.DATE)
	                  Date d,
	                  @RequestParam("price")
					  @NumberFormat(style=Style.CURRENCY,
					    pattern="###,###,##0.00")
					  BigDecimal price
			           ) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(d));
		System.out.println(price);
		
		return "main";
	}
}




