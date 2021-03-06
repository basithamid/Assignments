package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment2 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		Iterator<Integer> itr = hashSet.iterator();
		Iterator<Integer> itr1 = linkedHashSet.iterator();
		while(itr.hasNext()){
			System.out.println("HashSet: "+ itr.next());
		}
		while(itr1.hasNext()){
			System.out.println("LinkedHashSet: "+ itr1.next());
		}
	}

}
