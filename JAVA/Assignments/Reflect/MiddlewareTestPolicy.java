import java.lang.reflect.*;

class Test{
	private String name;
	private String getName(){
		return this.name;
	}
	public Test(){
		this.name="Basit";
	}
}

public class MiddlewareTestPolicy{
	public static void main(String args[]) throws Exception{
		Class<?> cls = Class.forName("Test");
		System.out.println(cls);
		Field f = cls.getDeclaredField("name");
		System.out.println(f);
		f.setAccessible(true);
		Test o=new Test();
		System.out.println(f.get(o));
		
		// Method m = Test.class.getDeclaredMethod();
		// System.out.println("Field:"+f);
		// System.out.println("Method:"+m);
	}
}