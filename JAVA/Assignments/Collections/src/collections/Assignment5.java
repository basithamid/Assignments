package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



class DOB{
	int day;
	int month;
	int year;
	public DOB(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString(){
		return ""+this.day+"/"+this.month+"/"+this.year;
	}
	@Override
	public boolean equals(Object obj){
		
		if(obj instanceof DOB){
			DOB date = (DOB)obj;
			if(this.day == date.day && this.month == date.month){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){
		String strDay = Integer.toString(this.day);
		String strMonth = Integer.toString(this.month);
		String hash = strDay+strMonth;
		int hashC = Integer.parseInt(hash);
		return hashC;
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		HashMap<DOB,String> map = new HashMap<>();
		DOB dob[] = new DOB[4];
		dob[0] = new DOB(29,12,1993);
		dob[1] = new DOB(25,06,1989);
		dob[2] = new DOB(25,06,1989);
		dob[3] = new DOB(29,12,1994);
		map.put(dob[0], "Basit");
		map.put(dob[1], "Fatima");
		map.put(dob[2], "Danish");
		map.put(dob[3], "Aadil");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair = (Map.Entry)itr.next();
			System.out.println("Key: "+pair.getKey()+ " - Value: "+pair.getValue());
		}
	}

}
