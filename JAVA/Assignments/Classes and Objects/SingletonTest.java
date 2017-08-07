class Singleton{
	private static Singleton instance = null;
	
	public String s;
	
	private Singleton(){
		s = "This is a string of Singleton Class";
	}

	public static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
		return instance;
	}

}
// class Singleton2 extends Singleton{
// 	public void print(){
// 		System.out.println("Singleton class has been inherited");
// 	}
// }

public class SingletonTest{
	public static void main(String args[]){
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println("String s from instance1: " + instance1.s);
		System.out.println("String s from instance2: " + instance2.s);
		instance2.s=instance2.s.toUpperCase();
		System.out.println("String s from instance1: " + instance1.s);
		System.out.println("String s from instance2: " + instance2.s);
	}
}

/**
*javac -d . SingletonTest.java
*SingletonTest.java:32: error: Singleton() has private access in Singleton
*class Singleton2 extends Singleton{
*^
*1 error
*/


