package exception;

import java.io.FileInputStream;

public class AutoCloseableTest {

	public static void main(String[] args) {
		String name="Basit";
		try(AutoCloseableClass auto = new AutoCloseableClass(); FileInputStream input = new FileInputStream("basit.txt")) {
			int a = 5 / 0;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
