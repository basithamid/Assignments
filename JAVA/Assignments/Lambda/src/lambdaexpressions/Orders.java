package lambdaexpressions;
import java.util.function.Predicate;


public class Orders {
	int orderPrice;
	String status;
	public Orders(int orderPrice, String status){
		this.orderPrice=orderPrice;
		this.status=status;
	}
	public String toString(){
		return "price: "+this.orderPrice+"/nStatus: "+this.status;
	}
	public static void print(Orders[] orders, Predicate p){
		for(Orders item:orders){
			if(p.test(item))
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		Orders[] orders=new Orders[5];
		orders[0]=new Orders(5000,"ACCEPTED");
		orders[1]=new Orders(12000,"ACCEPTED");
		orders[2]=new Orders(2000,"COMPLETED");
		orders[3]=new Orders(522222,"ACCEPTED");
		orders[4]=new Orders(411111,"COMPLETED");
		
		Predicate<Orders> pricePredicate = (Orders a)->a.orderPrice>10000;
		Predicate<Orders> statusPredicate = (Orders a)->a.status.equals("ACCEPTED");
		print(orders,pricePredicate );
		System.out.println("\n");
		print(orders, statusPredicate);
		
	}

}
