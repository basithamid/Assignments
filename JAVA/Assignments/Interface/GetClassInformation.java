import java.lang.reflect.*;

public class GetClassInformation{
	public static void main(String args[]){
		Class c = Class.forName(args[0]);
		Constructor con[] = c.getDeclaredConstructors();
		Field f[] = c.getDeclaredFields();
		Method m[] = c.getDeclaredMethods();

		for(int i = 0; i < con.length; i++){
			System.out.println(con[i]);
		}
	}
}