package file;
import java.io.*;

class Account{
	
	public Account(int accNo, double balance, String name) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
	}
	private int accNo;
	private double balance;
	private String name;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Assignment3 {

	public static void main(String[] args) throws Exception {
		Account arr[] = new Account[3];
		arr[0] = new Account(1, 10000, "Basit");
		arr[1] = new Account(2, 20000, "BD");
		arr[2]= new Account(3, 30000, "Anusha"); 
		File file = new File("D:/GIT/Assignments/JAVA/Assignments/new_File");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		for(int i=0;i<3;i++){
			dos.writeInt(arr[i].getAccNo());
			dos.writeUTF(arr[i].getName());
			dos.writeDouble(arr[i].getBalance());
		}
		dos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("D:/GIT/Assignments/JAVA/Assignments/new_File");
		DataInputStream dis = new DataInputStream(fis);
		for(int i=0;i<3;i++){
			System.out.println("[ID: "+dis.readInt()+", Name: "+dis.readUTF()+", Balance: "+dis.readDouble()+"]");
		}
		dis.close();
		fis.close();
		
	}

}
