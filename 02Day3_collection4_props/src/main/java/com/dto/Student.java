package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	
	private String name;
	private int age;
	private Map<String, Cat> mapCat; // has a 표현
	
	
	//전화번호(key/value가 모두 문자열로)
	Properties phones;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Map<String, Cat> getMapCat() {
		return mapCat;
	}

	public void setMapCat(Map<String, Cat> mapCat) {
		this.mapCat = mapCat;
	}
	
	

	public Properties getPhones() {
		return phones;
	}

	public void setPhones(Properties phones) {
		this.phones = phones;
	}

	public String getInfo() {
		return name+"\t"+age;
	}
	

}
