package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.DeptDTO;

public class DeptDAO {

	@Autowired
	SqlSessionTemplate template;
	
	public List<DeptDTO> selectAll(){
		return template.selectList("DeptMapper.selectAll");
	}

	public void insert(DeptDTO dto) {
		template.insert("DeptMapper.deptInsert", dto);
	}

	public void update(DeptDTO dto) {
		template.update("DeptMapper.deptUpdate", dto);
		
	}

	public void delete(int n) {
		// TODO Auto-generated method stub
		template.delete("DeptMapper.deptDelete", n);
	}

	public void tx() throws Exception{
		// TODO Auto-generated method stub
		template.delete("DeptMapper.deptDelete", 1);
		DeptDTO dto = new DeptDTO(6, "6666", "6666");
		template.insert("DeptMapper.deptInsert", dto );
	}
}




