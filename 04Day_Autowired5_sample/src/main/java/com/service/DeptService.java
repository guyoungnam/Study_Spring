package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DeptDAO;

public class DeptService {
	
	@Autowired
	DeptDAO dao;


	
	public List<String>list(){
		return dao.list();
	}

}
