package com.dto;

public class Student {
	
	private String name;
	private int age;
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
		return name+"\t"+age+"\t"+cat.getCatInfo();
	}
	

}
