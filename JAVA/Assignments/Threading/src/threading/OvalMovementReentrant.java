package threading;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OvalMovementReentrant extends Frame implements Runnable{

	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	boolean running=true;
	public volatile int count = 0;
	ReentrantLock lock = new ReentrantLock(true);
	Condition cond = lock.newCondition();
	
	public OvalMovementReentrant() {
		super("Oval Game");
		t1 = new Thread(this);
		t1.setName("Ball 1");
		t1.start();
		
		t2 = new Thread(this);
		t2.setName("Ball 2");
		t2.start();
		
		t3 = new Thread(this);
		t3.setName("Ball 3");
		t3.start();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void halt() throws InterruptedException{
		
		lock.lock();
		try{
			if(count!=3){
				cond.await();
			}
			else if(count==3){
				count=0;
				cond.signalAll();
			}
		}
		finally{
			lock.unlock();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("Ball 1")){
				
				for(;;){
					for(;this.y1>=100;){
						this.y1--;
						if(this.y1==100){
							count++;
							try {
								this.halt();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
						
						repaint();
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					for(;this.y1<=400;){
						this.y1++;
						if(this.y1==400){
							count++;
							try {
								this.halt();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						repaint();
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
			
		
		
		else if(currentThread.getName().equals("Ball 2")){
			
			for(;;){
				for(;this.y2>=100;){
					this.y2--;
					if(this.y2==100){
						count++;
						try {
							this.halt();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(;this.y2<=400;){
					this.y2++;
					if(this.y2==400){
						count++;
						try {
							this.halt();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		else if(currentThread.getName().equals("Ball 3")){
			for(;;){
				for(;this.y3>=100;){
					this.y3--;
					if(this.y3==100){
						count++;
						try {
							this.halt();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					repaint();
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				for(;this.y3<=400;){
					this.y3++;
					if(this.y3==400){
						count++;
						try {
							this.halt();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					repaint();
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		
		}
	}
	
	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}
	
	public static void main(String args[]) {
		Frame om = new OvalMovementTemplate();
		om.setSize(600, 600);
		om.setBackground(Color.CYAN);
		om.setVisible(true);
	}



	
}

