package com.spring.advertisement.entity;

import javax.persistence.*;

@Entity
@Table(name="Actions")
public class Actions {
	@Id
	@Column(name="Action")
	private String actionName;
	public Actions(){}
	public Actions(String actionName) {
		super();
		this.actionName = actionName;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	@Override
	public String toString() {
		return "Actions [actionName=" + actionName + "]";
	}
	
}
