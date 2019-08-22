package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.dto.Login;
import com.dto.UploadDTO;

@Controller
public class TestController {

	//GEt
	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String xxx() { 
		return "uploadForm";
	}
	
	@RequestMapping(value="/upload" , method=RequestMethod.POST)
	public String xxx2(UploadDTO dto) { 
		
		String theText = dto.getTheText();
		CommonsMultipartFile theFile = dto.getTheFile();
		
		long size = theFile.getSize();
		String name = theFile.getName();
		String originalFilename = theFile.getOriginalFilename();
		String contentType = theFile.getContentType();
		
		System.out.println("size:"+size);
		System.out.println("name:"+name);
		System.out.println("originalFilename:"+originalFilename);
		System.out.println("contentType:"+contentType);
		
		//저장 디렉토리
		File f = new File("c://upload",originalFilename);
		
		try {
			theFile.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "uploadInfo";
	}
}




