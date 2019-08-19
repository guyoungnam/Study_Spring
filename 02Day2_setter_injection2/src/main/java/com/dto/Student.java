package com.dto;
//빈(bean)
public class Student {
	
	// property (변수)
	private String name;
	private int age;
	
	//setter injection
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return name+"\t"+age;
	}

	

}
