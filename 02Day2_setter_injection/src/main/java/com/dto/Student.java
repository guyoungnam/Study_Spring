package com.dto;
//빈(bean)
public class Student {
	
	// property (변수)
	private String name;
	
	//setter injection
	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}

}
// firstStudent.setAddress("홍길동");