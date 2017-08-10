package annotation1;
import annotation1.*;
import java.lang.reflect.*;

public class Test{
	public static void main(String args[]){
		GetterTest gt = new GetterTest();
		Method[] methods =gt.getClass().getDeclaredMethods();
		Field[] fields = gt.getClass().getDeclaredFields();
				
		for(Method meth:methods){
			if(meth.isAnnotationPresent(Getter.class)){
				//System.out.println(meth.getName());
				if(meth.getName().length()>3){
					boolean flag=false;
					for(int i=0;i<fields.length;i++){
						if( (meth.getName().toString().substring(3, 4).equals(fields[i].getName().toString().substring(0, 1).toUpperCase())) &&
							(meth.getReturnType().equals(fields[i].getType()) && meth.getParameterTypes().length==0) ){
								flag=true;
								System.out.println("Method:" +meth.getName());
						}
						
						
						if(flag){
							
						}
						else{
							System.out.println(meth.getName()+": Error");
						}
					}
				}
			}
		}
		
	}
}