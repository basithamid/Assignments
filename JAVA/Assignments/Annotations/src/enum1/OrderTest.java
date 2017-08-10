package enum1;

import java.util.Scanner;

class Order{
	private int orderId;
	private String orderName;
	private int quantity;
	private int price;
	Status orderStatus;
	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Order(Status orderStatus, int orderId, String orderName, int quantity, int price) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.quantity = quantity;
		this.price = price;
		this.orderStatus=orderStatus;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Order order = new Order(Status.NEW,1,"Milk",2,25);
		System.out.println("Order Status:"+order.getOrderStatus().getValue());
		System.out.println("Enter\n2. Order Rejected\n3. Order Accepted\n4. Order Completed");
		int choice = scan.nextInt();
		switch(choice){
		case 2: 
			order.setOrderStatus(Status.REJECTED);
			break;
			
		case 3: 
			order.setOrderStatus(Status.ACCEPTED);
			break;
		case 4: 
			order.setOrderStatus(Status.COMPLETED);
			break;
			
		}
		System.out.println("New order status: "+order.getOrderStatus().getValue());
	}

}
