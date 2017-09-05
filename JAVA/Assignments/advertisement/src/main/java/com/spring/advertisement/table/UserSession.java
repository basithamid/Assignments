package com.spring.advertisement.table;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="UserSession")
public class UserSession {
	@Id
	@Column(name="id")
	private String sessionId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="logindate")
	private Date date;

	public UserSession(String sessionId, String userName, Date date) {
		super();
		this.sessionId = sessionId;
		this.userName = userName;
		this.date = date;
	}

	public UserSession(){}
	public UserSession(String userName, Date date) {
		super();
		this.userName = userName;
		this.date = date;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
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
		return "UserSession [sessionId=" + sessionId + ", userName=" + userName + ", date=" + date + "]";
	}

	
	
}
