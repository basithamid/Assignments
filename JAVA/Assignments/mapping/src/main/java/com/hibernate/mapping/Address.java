package com.hibernate.mapping;

import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="address_id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	public Address(){}

	

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}



	public Address(int id, String city, String state) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
	}
	
}
