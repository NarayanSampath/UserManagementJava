package com.test.UserManagement.amodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginCred {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long LoginId;
	private String userName;
	private String password;
	
	
	public Long getLoginId() {
		return LoginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
