package cache;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.sql.Timestamp;
class App {
	String name;
	int id;
	HashMap<Integer,ArrayList<Object>> map = new HashMap<>();
	Cache cache = new Cache();
	
	public void setData(int key,String name){
		this.id=key;
		this.name=name;
		
		cache.addToMap(key,name);
	}
	public Object getMap(int key){
		return map.get(key);
	}
	
	private class Cache{
		private Date timeStamp = new Date();
		public void addToMap(int key, String name){
			ObjectClass objClass = new ObjectClass(){
				String name;
				Date time;
				public void makeObject(String name, Date time){
					this.name=name;
					this.time=time;
				}
			};
			map.put(key, (ArrayList<Object>) objClass);
			System.out.println(map.get(key));
		}
		
	}
}

public class MyApp{
	public void main(String args[]){
		App app = new App();
		app.setData(1, "Basit");
		app.setData(2, "Rakhi");
		app.setData(3, "Bhavdeep");
		
		
	}
}
