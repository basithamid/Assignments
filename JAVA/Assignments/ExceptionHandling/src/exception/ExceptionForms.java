package exception;
class ABC{
	public void print(){
		System.out.println("Hi");
	}
}
public class ExceptionForms {
	public static void main(String args[]){
		int a = 5, b = 0;
		ABC abc=null;
		try{
//			System.exit(0);
			int c = a / b;
			System.out.println("No problem");
			abc.print();
//			try{
//				abc.print();
//			}
//			catch(Exception e){
//				e.printStackTrace();
//			}
		}
//		catch(ArithmeticException e){
//			e.printStackTrace();
//		}
		finally{
			System.out.println("Exception not caught");
		}
		
		System.out.println("Program ends");
		
		
		
	}
}
