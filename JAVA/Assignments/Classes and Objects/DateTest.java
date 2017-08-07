class Date{
	private int day,month,year;
	public Date(){
		this.day=7;
		this.month=8;
		this.year=2017;
	}
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return this.day;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return this.month;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;
	}
	public void printDate(){
		System.out.println("The date is: "+this.day + "/" + this.month + "/" +  this.year);
	}
	public static void swapDate(Date d1, Date d2,Date tempDate){
		tempDate.setDay(d1.getDay());
		d1.setDay(d2.getDay());
		d2.setDay(tempDate.getDay());
	}
}

public class DateTest{
	
	public static void main(String args[]){
		Date d=new Date();
		Date d2=new Date(29,12,1993);
		d.printDate();
		d2.printDate();
		d2.setDay(17);
		d2.setMonth(1);
		d2.setYear(1995);
		d2.printDate();
		Date tempDate=new Date(0,0,0);
		System.out.println("D day: "+d.getDay());
		System.out.println("D2 day: "+d2.getDay());
		Date.swapDate(d,d2,tempDate);
		System.out.println("");
		System.out.println("D day: "+d.getDay());
		System.out.println("D2 day: "+d2.getDay());
	}
}