package com.ars.backend.dto;

import javax.persistence.Id;

public class UserLogin {
	
	@Id
	private String loginId;
	private String password;
	private String typeOfUser;
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	
	@Override
	public String toString() {
		return "UserLogin [loginId=" + loginId + ", password=" + password + ", typeOfUser=" + typeOfUser + "]";
	}	
}
