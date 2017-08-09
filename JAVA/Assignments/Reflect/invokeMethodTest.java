package invokegenericmethod;
import java.lang.reflect.*;

class Namex{
	
	public String getName(String name){
		return name;
	}
	public int add(int a, int b){
		return a+b;
	}
}

class Middleware{
	public static Object invokeMethod(String className, String method, Class paramTypes[], Object params[]) throws Exception{
		try{
			Class c = Class.forName(className);
			Object obj = c.newInstance();
			Method m = c.getDeclaredMethod(method,paramTypes);
			return m.invoke(obj,params);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}


public class invokeMethodTest{
	public static void main(String args[]) throws Exception
	{
		Class[] paramString = new Class[1];
		paramString[0] = String.class;
		Object param[] = new Object[1];
		param[0] = "Basit";
		String name = (String)Middleware.invokeMethod("Namex","getName",paramString, param);
		System.out.println("Name:"+name);
		
	}
}