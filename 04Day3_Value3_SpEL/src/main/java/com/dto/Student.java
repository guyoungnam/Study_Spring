package com.dto;


import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	//SpEL 표기법
	@Value("#{stu.name}")
	private String name;
	
	@Value("#{stu.age}")
	private int age;
     


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		System.out.println("getName");
		return name;
	}

	public int getAge() {
		System.out.println("getAge");
		return age;
	}

	public String getInfo() {
		return name+"\t"+age;
	}
	
	//
	

}
