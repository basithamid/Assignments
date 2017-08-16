package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee{
	public boolean equals(Object obj){
		return true;
	}
	@Override
	public int hashCode(){
		return 1;
	}
}


public class Assignment4 {

	public static void main(String[] args) {
		HashMap<Employee,String> map = new HashMap<>();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		map.put(e1, "Basit");
		map.put(e2, "Rakhi");
		map.put(e3, "Bhavdeep");
		map.put(e4, "Rajo");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair = (Map.Entry)itr.next();
			System.out.println("Key:"+pair.getKey()+" - Value:"+pair.getValue());
		}
		
	}

}
