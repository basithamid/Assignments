package file;
import java.io.*;

import javax.security.auth.login.AccountNotFoundException;

class DOB implements Serializable{
	private int day,month,year;

	public DOB(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}

class AccountSerialization implements Serializable{
	/**
	 * 
	 */
	
	public static final long serialVersionUID = 15000L;
	transient private int id;
	private String name;
	private double password;
	private DOB dob;
	public AccountSerialization(int id, String name, double password, DOB dob) {
		super();
		this.id = id;
		this.name = name;
		
		this.password = password;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}
	public DOB getDob() {
		return dob;
	}
	public void setDob(DOB dob) {
		this.dob = dob;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) throws Exception {
		AccountSerialization acc = new AccountSerialization(1, "Basit", 10.00, new DOB(29,12,1993));
		AccountSerialization acc1 = new AccountSerialization(2, "Anusha", 10.00, new DOB(20,10,1994));
		//serialization code
		

		File file = new File("newFile1");
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream out = new ObjectOutputStream(fos);
//		out.writeObject(acc);
//		out.writeObject(acc1);
//		out.flush();
//		out.close();
//		fos.close();
		
		//de-serializtion code
		//File file1 = new File("newFile1");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fis);
		AccountSerialization acc2 = (AccountSerialization)in.readObject();
		System.out.println(acc2.getId()+" "+acc2.getName());
		AccountSerialization acc3 = (AccountSerialization)in.readObject();
		System.out.println(acc3.getId()+" "+acc3.getName());
	}

}
