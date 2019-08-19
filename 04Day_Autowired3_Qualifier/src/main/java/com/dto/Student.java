package com.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Cat cat) {
		super();
		this.cat = cat;
	}


	private String name;
	private int age;
  
	@Autowired
	@Qualifier("pet01")
	private Cat cat; // has a 표현

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setCat(Cat cat) {
		this.cat = cat;
	}


	public String getInfo() {
		return name+"\t"+age+"\t"+cat;
	}
	
	//
	

}
