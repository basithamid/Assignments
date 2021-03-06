package com.hibernate.project2;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name="EMPNO")
	private int eid;
	
	@Column(name="FNAME")
	private String name;
	
	@Column(name="SAL")
	private double salary;
	
	@Column(name="CITY")
	private String city;
	
	public Employee(){}

	public Employee(String name, double salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public Employee(int eid, String name, double salary, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
}
