package com.hibernate.mapping;

import javax.persistence.*;



@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;
	
	public Customer(){}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
