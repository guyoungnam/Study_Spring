package com.dto;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {
	  System.out.println("기본 생성자 호출");
	}
	
	//init-method : 초기화작업
	public void aaa() {
		System.out.println("inint-method.aaa");
	}

	//destory-method : 자원 반납
		public void bbb() {
	    System.out.println("destory-method.aaa");
	}

}
