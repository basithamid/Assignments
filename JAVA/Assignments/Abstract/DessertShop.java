import java.util.Scanner;
import java.util.*;

abstract class DessertItem{
	abstract public double getCost();
	String itemName;
	double cost;
	int tax;
}

class Candy extends DessertItem{
	
	public Candy(String itemName, double cost){
		this.itemName = itemName;
		this.cost = cost;
		this.tax = 5;
	}
	public double getCost(){
		return (this.cost + (this.tax/100)*this.cost );
	}
}

class Cookie extends DessertItem{
	
	public Cookie(String itemName, double cost){
		
		this.tax = 10;
	}
	public double getCost(){
		return (this.cost + (this.tax/100)*this.cost );
	}
}

class IceCream extends DessertItem{
	
	public IceCream(String itemName, double cost){
		this.itemName = itemName;
		this.cost = cost;
		this.tax = 15;
	}
	public double getCost(){
		return (this.cost + (this.tax/100)*this.cost );
	}
}

class Inventory{
	private static Inventory instance = null;
	private Inventory(){

	}
	private static ArrayList<Candy> candies = new ArrayList<Candy>();
	private static ArrayList<Cookie> cookies = new ArrayList<Cookie>();
	private static ArrayList<IceCream> iceCreams = new ArrayList<IceCream>();

	public static Inventory getInstance(){
		if(instance == null){
			instance = new Inventory();
		}
		return instance;
	}
	public void addDessert(int dessertChoice, int quantity){
		switch(dessertChoice){
			case 1:
				DessertItem candy[] = new DessertItem[quantity];
				for(int i = 0; i<candy.length; i++){
					candy = new Candy("Ice Candy", 2);
					candies.add((Candy)candy);
				}
				break;
			case 2:
				DessertItem cookie[] = new DessertItem[quantity];
				for(int i = 0; i<quantity; i++){
					cookie[i] = new Cookie("Oreo", 1);
					cookies.add((Cookie)cookie[i]);
				}
				break;
			case 3:
				DessertItem iceCream[] = new DessertItem[quantity];
				for(int i = 0; i<quantity; i++){
					iceCream[i] = new IceCream("Cornetto", 30);
					iceCreams.add((IceCream)iceCream[i]);
				}
				break;
			default: System.out.println("Wrong choice");
		}
	}

	public void placeOrder(int choice, int quantity){
		switch(choice){
			case 1:
				if(quantity > candies.size()){
					System.out.println("Not enough candies");
				}
				else{
					for(int i = 0; i < quantity; i++){
						candies.remove(i);
					}

				}
				break;
			case 2:
				if(quantity > cookies.size()){
					System.out.println("Not enough cookies");
				}
				else{
					for(int i = 0; i < quantity; i++){
						cookies.remove(i);
					}

				}
				break;
			case 3:
				if(quantity > iceCreams.size()){
					System.out.println("Not enough Ice Cream");
				}
				else{
					for(int i = 0; i < quantity; i++){
						iceCreams.remove(i);
					}

				}
				break;

			default: System.out.println("Wrong choice");
		}
	}

}



public class DessertShop{
	public static void main(String args[]){
		Inventory inventory = Inventory.getInstance();
		System.out.println("Enter 1 for Owner, 2 for Customer");
		Scanner scan = new Scanner(System.in);
		int choice,quantity;
		while(true){
			choice = scan.nextInt();
			switch(choice){
				case 1:
					System.out.println("Add dessert item");
					System.out.println("1. Candy\n2. Cookies\n3. Ice Cream");
					choice = scan.nextInt();
					System.out.println("Enter quantity:");
					quantity = scan.nextInt();
					inventory.addDessert(choice,quantity);
					
				break;

				case 2:
					System.out.println("What does the customer want to buy?");
					System.out.println("1. Candy\n2. Cookies\n3. IceCream");
					choice = scan.nextInt();
					System.out.println("Enter quantity:");
					quantity = scan.nextInt();
					inventory.placeOrder(choice, quantity);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Wrong choice");
			}
		}
	}
}