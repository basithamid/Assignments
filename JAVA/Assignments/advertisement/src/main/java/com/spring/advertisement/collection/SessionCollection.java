package com.spring.advertisement.collection;


public class SessionCollection {
	private String id;
	private String uname;
	private String lastUpdatedDate;
	public SessionCollection(){}
	public SessionCollection(String id, String uname, String lastUpdatedDate) {
		super();
		this.id = id;
		this.uname = uname;
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
}
