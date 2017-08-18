package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

class Test implements Runnable{
	Thread t1,t2;
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
	CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
	public Test(){
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		t1 = new Thread(this);
		t1.setName("T1");
		t1.start();
		t2 = new Thread(this);
		t2.setName("T2");
		t2.start();
		
	}
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("T1")){
			Iterator itr = list.iterator();
			while(itr.hasNext()){
				System.out.println("List element: "+itr.next());
			}
		}
		else if(currentThread.getName().equals("T2")){
			Iterator itr1 = list.iterator();
			while(itr1.hasNext()){
				list.add(60);
				System.out.println("Element: "+itr1.next());
			}
			
		}
		display();
		
	}
	
	public void display(){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("Element: "+itr.next());
		}
	}
}

public class FailSafe_FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
	}

}
