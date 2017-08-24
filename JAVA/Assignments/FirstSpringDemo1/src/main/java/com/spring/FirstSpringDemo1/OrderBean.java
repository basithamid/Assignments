package com.spring.FirstSpringDemo1;

public class OrderBean {
	int orderID;
	ItemBean item;
	OrderBean(){
		System.out.println("OrderBean");
	}
	public OrderBean(int orderID, ItemBean item) {
		super();
		this.orderID = orderID;
		this.item = item;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public ItemBean getItem() {
		return item;
	}
	public void setItem(ItemBean item) {
		this.item = item;
	}
	
}