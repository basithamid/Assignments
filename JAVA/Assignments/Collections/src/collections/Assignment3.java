package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		ListIterator<Integer> listItr = arrayList.listIterator(arrayList.size());
		while(listItr.hasPrevious()){
			System.out.println("Value:"+listItr.previous());
		}
	}

}
