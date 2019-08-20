package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

public class DeptService {

	@Autowired
	DeptDAO dao;
	
	public List<DeptDTO> selectAll(){
		return dao.selectAll();
	}

	public void insert(DeptDTO dto) {
		dao.insert(dto);
	}

	public void update(DeptDTO dto) {
		// TODO Auto-generated method stub
		dao.update(dto);
	}

	public void delete(int n) {
		// TODO Auto-generated method stub
		dao.delete(n);
	}
	
	//트랜잭션 실습
	@Transactional
	public void tx() throws Exception{
		dao.tx();
	}
	
	
	
	
	
}
