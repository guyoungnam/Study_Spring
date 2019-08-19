package com.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private String name;
	private int age;
	
	public Student() {
	  System.out.println("기본 생성자 호출");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destory");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet");
		
	}
	


}
