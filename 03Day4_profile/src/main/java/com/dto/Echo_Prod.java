package com.dto;

public class Echo_Prod implements Echo {

	@Override
	public String sayEcho() {
		// TODO Auto-generated method stub
		return "production 프로파일";
	}

	public Echo_Prod() {
	System.out.println("Echo_prod");
	}

}
