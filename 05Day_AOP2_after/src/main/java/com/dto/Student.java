package com.dto;


//target 클래스
public class Student {
	
	public String sayEcho() {
		System.out.println("sayEcho호출");
		return "Hello";
	}
	
	public String callEcho() {
		System.out.println("callEcho호출");
		return "World";
	}

}
