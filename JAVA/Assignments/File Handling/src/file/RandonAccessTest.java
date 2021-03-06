package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandonAccessTest {

	public static void create(RandomAccessFile raf, Account acc) throws IOException{
		raf.writeInt(acc.getAccNo());
		raf.writeUTF(acc.getName());
		raf.writeDouble(acc.getBalance());
		}
	
	public static void read(RandomAccessFile raf) throws IOException{
		raf.seek(0);
		for(int i=0;i<3;i++){
			int id=raf.readInt();
			String name = raf.readUTF();
			double bal=raf.readDouble();
			System.out.println("[ ID: " +id+", Name: "+name+", Balance: "+bal+" ]");
		}
	}
	
	public static void update(RandomAccessFile raf) throws IOException{
		System.out.println("Enter ID of record to be updated: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		raf.seek(0);
		int tempid = 0;
		for(int i=0;i<3;i++){
			tempid=raf.readInt();
			if(tempid==id){
				raf.writeUTF(scan.next());
				raf.writeDouble(scan.nextDouble());
				break;
			}
			else{
				try{
					raf.readUTF();
					raf.readDouble();
				}
				catch(Exception e){
					System.out.println("not found");
				}
			}
		}
		
	}
	
	public static void delete(RandomAccessFile raf) throws IOException{
		File file1 = new File("randomAccessTemp.dat");
		RandomAccessFile raf1 = new RandomAccessFile(file1, "rw");
		System.out.println("Enter ID of record to be deleted: ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		raf.seek(0);
		raf1.seek(0);
		int tempid = 0;
		for(int i=0;i<3;i++){
			try{
				tempid=raf.readInt();
			}
			catch(Exception e){
				System.out.println("exception");
			}
			if(tempid==id){
				try{
					raf.readInt();
				}
				catch(Exception e){
					System.out.println("readInt()");
				}
				try{
					raf.readUTF();
				}
				catch(Exception e){
					System.out.println("hello");
				}
				try{
					raf.readDouble();
				}
				catch(Exception e){
					System.out.println("byebye");
				}
			}
			else{
				raf1.writeInt(tempid);
				String name = raf.readUTF();
				try{
					raf1.writeUTF(name);
				}
				catch(Exception e){
					System.out.println("bye");
				}
				double bal = raf.readDouble();
				raf1.writeDouble(bal);
			}
		}
		raf=raf1;
	}
	
	public static void main(String[] args) throws Exception {
		Account arr[] = new Account[3];
		arr[0] = new Account(1, 10000, "Basit");
		arr[1] = new Account(2, 20000, "Hamid");
		arr[2]= new Account(3, 30000, "Anusha"); 
		File file = new File("rafFile");
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		for(int i=0;i<3;i++){
			create(raf,arr[i]);
		}
		read(raf);
		update(raf);
		read(raf);
		//delete(raf);
//		read(raf);
	}

}
