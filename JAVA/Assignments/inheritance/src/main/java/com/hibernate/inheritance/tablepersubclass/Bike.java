package com.hibernate.inheritance.tablepersubclass;

import javax.persistence.*;


@Entity
@Table(name="Bike2")
@PrimaryKeyJoinColumn(name="v_id")
public class Bike extends Vehicle{
	@Column(name="bike")
	private String BikeModel;

	public Bike(String name, double cost, String BikeModel) {
		super(name, cost);
		this.BikeModel = BikeModel;
	}

	public String getBikeModel() {
		return BikeModel;
	}

	public void setBikeModel(String BikeModel) {
		this.BikeModel = BikeModel;
	}
}
