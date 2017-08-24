package com.spring.FirstSpringDemo1;

public class ItemBean {
	private String name;
	private int price;
	ItemBean(){
		System.out.println("ItemBean");
	}
	public ItemBean(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
