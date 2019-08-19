package com.dto;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class Person implements MessageSourceAware {
	
	MessageSource m;
	
	public void info() {
		String mesg= m.getMessage("hello", null, Locale.KOREA);
		System.out.println(mesg);
		
		String xxx= m.getMessage("hello2", new String[] {"kkk","yyy"}, Locale.KOREA);
		System.out.println(xxx);
		
		String mesg2= m.getMessage("hello", null, Locale.ENGLISH);
		System.out.println(mesg2);
		
	}
	


    //자동으로 Reload 주입돈다.
	@Override
	public void setMessageSource(MessageSource messageSource) {
		// TODO Auto-generated method stub
		
	}
}