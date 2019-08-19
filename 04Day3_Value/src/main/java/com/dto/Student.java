package com.dto;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("홍길동")
	private String name;
	
	@Value("10")
	private int age;
     


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public String getInfo() {
		return name+"\t"+age;
	}
	
	//
	

}
