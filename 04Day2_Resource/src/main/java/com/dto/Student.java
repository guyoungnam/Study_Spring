package com.dto;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
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
     
	@Resource(name="cat1")  //이름으로 찾다가 없으면 타입으로 찾는다.
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
