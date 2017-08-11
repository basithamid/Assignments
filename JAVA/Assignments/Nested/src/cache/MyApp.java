package cache;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.sql.Timestamp;
class App {
	String name;
	int id;
	HashMap<Integer,Object> map = new HashMap<>();
	Cache cache = new Cache();
	public void setData(int key,String name){
		cache.addToMap(key, name);
		
	}
//	public Object getMap(int key){
//		return map.get(key);
//	}
	
	private class Cache{
		
		public void addToMap(int key, String name){
			Object objClass = new ObjectClass(name,new Timestamp()){
				String name;
				
				public ObjectClass(String name,Timestamp time){
					
				}
			};
			
		}
		
	}
}

public class MyApp{
	public static void main(String args[]){
		App app = new App();
		app.setData(1, "Basit");
		app.setData(2, "Rakhi");
		app.setData(3, "Bhavdeep");
		
		
	}
}
