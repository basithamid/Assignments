import java.lang.*;
import java.util.Scanner;
class DOB implements Cloneable{
	private int day,month,year;
	public DOB(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void setDOB(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day){
		this.day=day;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
	public String toString(){
		return (this.day+"-"+this.month+"-"+this.year);
	}
	
}

class Employee implements Cloneable{
	int id;
	String name;
	DOB dob = new DOB(29,12,1993);
	
	public DOB getDOB(){
		return this.dob;

	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {
		Employee emp2 = (Employee)super.clone();
		emp2.dob = (DOB)emp2.dob.clone();
		return emp2; 

	}
	public void setDOB(int day, int month, int year){
		dob.setDay(day);
		dob.setMonth(month);
		dob.setYear(year);
	}
	public String toString(){
		String dateOfBirth = dob.getDay()+"-"+dob.getMonth()+"-"+dob.getYear();
		return ("ID:"+this.id+"\n"+dateOfBirth);
	}

}

public class EmployeeCloneable{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		if(choice==1){
			try{
				Employee emp1=new Employee(1,"Basit");
				Employee emp2 = (Employee)emp1.clone();
				System.out.println("Employee1:"+emp1.toString());
				System.out.println("Employee2:"+emp2.toString());
				emp1.setDOB(17,01,1995);
				System.out.println("After DOB change");
				System.out.println("Employee1:"+emp1.toString());
				System.out.println("Employee2:"+emp2.toString());
				

		}
			catch(CloneNotSupportedException e){
				System.out.println("Cannot clone object");
			}
		}
		else{
			try{
				Employee emp1=new Employee(1,"Basit");
				Employee emp2 = (Employee)emp1.clone();
				System.out.println("Employee1:"+emp1.toString());
				System.out.println("Employee2:"+emp2.toString());
				emp1.setDOB(17,01,1995);
				System.out.println("After DOB change");
				System.out.println("Employee1:"+emp1.toString());
				System.out.println("Employee2:"+emp2.toString());
			}
			
			catch(CloneNotSupportedException e){
				System.out.println("Cannot clone object");
			}
			
				
		}
		
	}
}

