package annotation1;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Getter{
	
}

class GetterTest{
	int id;
	String name;
	@Getter
	public String getName(){
		return this.name;
	}
	@Getter
	public int getId(){
		return this.id;
	}
	@Getter
	public void setId(){
		
	}
	
	public void setName(){
		
	}
}
