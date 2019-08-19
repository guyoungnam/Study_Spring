package com.dto;

public class Echo_Dev implements Echo {

	@Override
	public String sayEcho() {
		// TODO Auto-generated method stub
		return "development 프로파일";
	}

	public Echo_Dev() {
	System.out.println("Echo_Dev");
	}

}
