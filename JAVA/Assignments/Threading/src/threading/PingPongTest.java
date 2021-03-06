package threading;


class PingPong implements Runnable{
	Thread t1,t2,t3;
	public PingPong(){
		t1 = new Thread(this);
		t1.setName("PING");
		t1.start();
		t2 = new Thread(this);
		t2.setName("PONG");
		t2.start();
		t3 = new Thread(this);
		t3.setName("DINGDONG");
		t3.setDaemon(true);
		t3.start();
	}
	@Override
	public void run(){
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("PING")){
			for(int i =0; i<10; i++){
				System.out.println("PING");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("PONG")){
			for(int i =0;i<10;i++){
				System.out.println("\tPONG");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		else if(currentThread.getName().equals("DINGDONG")){
			for(;;){
				System.out.println("\t\tDINGDONG");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
public class PingPongTest {

	public static void main(String[] args) {
		new PingPong();
		
	}

}
