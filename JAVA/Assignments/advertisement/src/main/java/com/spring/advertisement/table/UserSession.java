package com.spring.advertisement.table;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="UserSession")
public class UserSession {
	@Id
	@Column(name="auth_token")
	private String auth_token;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="logindate")
	private Date date;

	public UserSession(String auth_token, String userName, Date date) {
		super();
		this.auth_token = auth_token;
		this.userName = userName;
		this.date = date;
	}

	public UserSession(){}
	public UserSession(String userName, Date date) {
		super();
		this.userName = userName;
		this.date = date;
	}

	public String getauth_token() {
		return auth_token;
	}

	public void setauth_token(String auth_token) {
		this.auth_token = auth_token;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserSession [auth_token=" + auth_token + ", userName=" + userName + ", date=" + date + "]";
	}

	
	
}
