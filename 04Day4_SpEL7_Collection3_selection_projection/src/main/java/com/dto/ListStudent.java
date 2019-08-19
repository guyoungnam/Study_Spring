package com.dto;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class ListStudent {

	List<Student> list;

	List<String> ageValues;
	
	
	
	public List<String> getAgeValues() {
		return ageValues;
	}

	public void setAgeValues(List<String> ageValues) {
		this.ageValues = ageValues;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	
}
