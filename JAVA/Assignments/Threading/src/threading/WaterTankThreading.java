package threading;

class WaterTank implements Runnable{
	Thread inlet,outlet,controller;
	static int level;
	static boolean suspendedInlet = false;
	static boolean suspendedOutlet = true;
	public WaterTank(){
		level = 0;
		controller = new Thread(this);
		controller.setName("Controller");
		controller.setDaemon(true);
		
		inlet = new Thread(this);
		inlet.setName("Inlet");
		
		outlet = new Thread(this);
		outlet.setName("Outlet");
		
		controller.start();
		inlet.start();
		outlet.start();
		
	}
	public void run(){
		Thread currentThread = Thread.currentThread();
		System.out.println("Hi");
		if(currentThread.getName().equals("Inlet")){
			for(;;){
				level += 50;
//				System.out.println("WaterLevel:"+level);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		else if(currentThread.getName().equals("Outlet")){
			for(;;){
				level = level - 70;
//				System.out.println("Spilling:"+level);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		else if(currentThread.getName().equals("Controller")){
			for(;;){
				if(level<=799){
					System.out.println("WaterLevel:"+level);
					if(suspendedOutlet=true){
						outlet.suspend();
						inlet.resume();
						suspendedInlet=true;
						suspendedOutlet=false;
					}
					
					
				}
				else {
					System.out.println("Spilling:"+level);
					if(suspendedInlet=true){
						inlet.suspend();
						outlet.resume();
						suspendedOutlet=true;
						suspendedInlet=false;
					}
					
					
					
				}
			}
		}
	}
}

public class WaterTankThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterTank waterTank = new WaterTank();

	}

}
