package com.dto;

import java.util.Arrays;

public class Login {

	private String userid;
	private String passwd;
	
	//phone
	
	private String [] phone;
	
	
	
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "Login [userid=" + userid + ", passwd=" + passwd + ", phone=" + Arrays.toString(phone) + "]";
	}

	
	
	
	
	
	
}
