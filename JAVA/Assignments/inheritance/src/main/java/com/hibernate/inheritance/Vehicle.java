package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue
	@Column(name="v_id")
	private int id;
	
	public Vehicle(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double cost;
	
	public Vehicle(){}

	public Vehicle(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
