package com.hibernate.mapping;

import javax.persistence.*;

@Entity
@Table(name="Stock")
public class Stock {

	@Id
	@GeneratedValue
	@Column(name="s_id")
	private int id;
	
	@Column(name="s_name")
	private String name;
	
	@Column(name="s_price")
	private double price;
	
	@ManyToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.EAGER)
	@JoinColumn(name="market_id")
	private Market market;
	
	public Stock(){}

	public Stock(String name, double price, Market market) {
		super();
		this.name = name;
		this.price = price;
		this.market = market;
	}

	public Stock(int id, String name, double price, Market market) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.market = market;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", market=" + market + "]";
	}
	
}
