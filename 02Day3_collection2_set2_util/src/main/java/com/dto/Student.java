package com.dto;

import java.util.List;
import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Set<Cat> setCat; // has a 표현
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Cat> getSetCat() {
		return setCat;
	}

	public void setSetCat(Set<Cat> setCat) {
		this.setCat = setCat;
	}

	public String getInfo() {
		return name+"\t"+age;
	}
	

}
