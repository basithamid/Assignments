package generics;

import java.util.ArrayList;
import java.util.Iterator;

class List{
	public void display(ArrayList<? extends Number> list){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("Number element: "+itr.next());
		}
	}
}

public class NumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		list.display(intList);
		ArrayList<Double> strList = new ArrayList<>();
		strList.add(10.23);
		strList.add(10.23);
		strList.add(10.23);
		strList.add(10.23);;
		list.display(strList);
	}

}
