package com.spring.advertisement.entity;

public class UserLogin {
	private String uname;
	private String pwd;
	public UserLogin(){}
	public UserLogin(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "UserLogin [uname=" + uname + ", pwd=" + pwd + "]";
	}
	
}
