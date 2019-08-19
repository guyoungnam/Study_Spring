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
	
	//constructor injection
    public Student(int age) {
		super();
		this.age = age;
	}


//이름은 생성자 
	public String getInfo() {
		return name+"\t"+age;
	}

}
