//package com.spring.advertisement.collection;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection="users")
//public class UserCollection {
//	@Id
//	private String  id;
//	private String  fname;
//	private String  lname;
//	private String  uname;
//	private String  pwd;
//	public UserCollection(){}
//	public UserCollection(String  id, String  fname, String  lname, String  uname, String  pwd) {
//		super();
//		this.id = id;
//		this.fname = fname;
//		this.lname = lname;
//		this.uname = uname;
//		this.pwd = pwd;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String  id) {
//		this.id = id;
//	}
//	public String  getFname() {
//		return fname;
//	}
//	public void setFname(String  fname) {
//		this.fname = fname;
//	}
//	public String  getLname() {
//		return lname;
//	}
//	public void setLname(String  lname) {
//		this.lname = lname;
//	}
//	public String  getUname() {
//		return uname;
//	}
//	public void setUname(String  uname) {
//		this.uname = uname;
//	}
//	public String  getPwd() {
//		return pwd;
//	}
//	public void setPwd(String  pwd) {
//		this.pwd = pwd;
//	}
//	@Override
//	public String toString() {
//		return "UserCollection [id=" + id + ", uname=" + uname + ", pwd=" + pwd + ", fname=" + fname + "]";
//	}
//}
