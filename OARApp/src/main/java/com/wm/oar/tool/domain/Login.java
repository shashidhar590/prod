package com.wm.oar.tool.domain;

import org.springframework.stereotype.Component;

@Component
public class Login extends BaseVO{

	private static final long serialVersionUID = 1L;
	
	private String loginId;
	private String password;
	private String role;
	
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
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
