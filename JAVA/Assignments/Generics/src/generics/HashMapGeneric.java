package generics;

import java.util.HashMap;
import java.util.Iterator;

class Test{
	public <K extends Number >void printMapKeyValues(HashMap<K ,? >map){
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

public class HashMapGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		HashMap<Number,Object> map = new HashMap<>();
		map.put(1, "Basit");
		map.put(1.5,12);
		map.put(-10.2, "Basit"+10);
		//map.put("Basit", 10);
		test.printMapKeyValues(map);
		
	}

}