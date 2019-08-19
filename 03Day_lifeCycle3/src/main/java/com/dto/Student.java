package com.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
	  System.out.println("기본 생성자 호출");
	}
	
	//어노테이션
	@PostConstruct
	public void xxx() {
		System.out.println("초기화 메서드xxx");
	}
	
	@PreDestroy
	public void yyy() {
		
		System.out.println("초기화 메서드yyy");
	}


}
