abstract class ABC{
	public void abc(){
		System.out.println("abc");
	}
	
}

class DEF extends ABC{
	// public void abc(){
	// 	System.out.println("def");
	// }
}



public class ABCTest{
	public static void main(String args[]){
		ABC abcObj = new DEF();
		abcObj.abc();
	}
}