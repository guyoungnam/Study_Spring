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
	
	
	//7. /hhh/aaaa, /hhh/xxxx  
	@RequestMapping(value= "/hhh/{userid}/xxx/{passwd}" , method=RequestMethod.GET)
	public String hhh() { 
		System.out.println("hhh 호출");
		return "main";
	}
	
	//6. *는 하나의 문자열  ddd/zzz, ddd/bbb, ddd/bbb/ccc(o)  
	@RequestMapping(value= "/fff/**/ggg" , method=RequestMethod.GET)
	public String fff() { 
		System.out.println("fff 호출");
		return "main";
	}
	
	//5. **는 여러경로 가능 ddd/zzz, ddd/bbb, ddd/bbb/ccc(o) 
	@RequestMapping(value= "/eee/**" , method=RequestMethod.GET)
	public String eee() { 
		System.out.println("eee 호출");
		return "main";
	}
	 
	//4. *는 하나의 문자열  ddd/zzz, ddd/bbb 
	@RequestMapping(value= "/ddd/*" , method=RequestMethod.GET)
	public String ddd() { 
		System.out.println("ddd 호출");
		return "main";
	}
	
	//3.ccc로 시작하는 요청
			@RequestMapping(value= "/ccc*" , method=RequestMethod.GET)
			public String ccc() { 
				System.out.println("ccc 호출");
				return "main";
			}
	
	//2.매핑값 여러
		@RequestMapping(value= {"/aaa2","/bbb2"} , method=RequestMethod.GET)
		public String aaa2() { 
			System.out.println("aaa2 호출");
			return "main";
		}

	//1.매핑값 하나
	@RequestMapping(value="/aaa" , method=RequestMethod.GET)
	public String xxx() { 
		System.out.println("aaa 호출");
		return "main";
	}


}





