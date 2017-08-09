public class Banner{
	public static void main(String args[]){
		StringBuilder banner = new StringBuilder("Welcome to JAVA ");
		for(;;){
			banner.append(banner.charAt(0));
			banner.deleteCharAt(0);
			//Thread.sleep(2000);
			System.out.print(banner+"\r");
		}
	}
}