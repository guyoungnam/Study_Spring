package com.dto;

public class Student {
	
	private String name;

	public Student(String x) {
		System.out.println("인자있는생성자");
		this.name = x;
	}
	
	public String getInfo() {
		return name;
	}

}
