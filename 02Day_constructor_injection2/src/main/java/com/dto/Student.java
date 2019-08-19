package com.dto;

public class Student {
	
	private String name;
	private int age;
	
	// 20이 문자열이지만 자동으로 변환이 된다.
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int age) {
		super();
		this.age = age;
	}
	
	public String getInfo() {
		return name+"\t"+age;
	}
	

}
