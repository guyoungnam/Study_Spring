package com.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.Login;

@Controller
public class TestController {

	//GEt
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public String xxx() { 
		return "loginForm";
	}
	
	//POST
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String ttt8( Login dto ) {
		System.out.println(dto);
		return "login";
	}

	@RequestMapping(value="/login7" , method=RequestMethod.POST)
	public String ttt7( @RequestParam Map<String, String> map ) {
		System.out.println(map);
		return "login";
	}
	

	@RequestMapping(value="/login6" , method=RequestMethod.POST)
	public String ttt6( @RequestParam(value="userid2",
	                                 required = false,
	                                 defaultValue = "유관순")
	                    String id , 
			           @RequestParam(value="passwd") int pw) {
		System.out.println(id+"\t"+pw);
		return "login";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="/login5" , method=RequestMethod.POST)
	public String ttt(  String userid , 
			            String passwd) {
		System.out.println(userid+"\t"+passwd);
		return "login";
	}
	
	
	
	
	
	@RequestMapping(value="/login4" , method=RequestMethod.POST)
	public String ttt4( @RequestParam String userid , 
			           @RequestParam String passwd) {
		System.out.println(userid+"\t"+passwd);
		return "login";
	}
	
	
	
	
	
	
	
	// 한글처리 ==> Filter이용
	@RequestMapping(value="/login3" , method=RequestMethod.POST)
	public String ttt2( @RequestParam("userid") String id , 
			           @RequestParam("passwd") String pw) {
		System.out.println(id+"\t"+pw);
		return "login";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/login2" , method=RequestMethod.POST)
	public String xxx2(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");
		System.out.println(id+"\t"+pw);
		return "login";
	}
}





