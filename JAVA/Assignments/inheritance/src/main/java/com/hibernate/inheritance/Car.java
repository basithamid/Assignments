package com.hibernate.inheritance;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="car")
public class Car extends Vehicle{
	@Column(name="carmodel")
	private String model;

	public Car(String name, double cost, String model) {
		super(name, cost);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
