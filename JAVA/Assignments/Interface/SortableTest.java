interface Sortable{
	public boolean compare(Sortable s);
}
// class Circle
class Circle implements Sortable{
	private int radius;
	public int getRadius(){
		return this.radius;
	}
	public Circle(int radius){
		this.radius = radius;
	}
	public boolean compare(Sortable s){
		Circle c1 = (Circle)s; 
		if(this.getRadius() > c1.getRadius() )
			return true;
		else
			return false;
	}
	public String toString(){
		return this.radius+"";
	}
}

// Class Employee
class Employee implements Sortable{
	private int id;
	public Employee(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public boolean compare(Sortable s){
		Employee e1 = (Employee)s;
		if(this.getId() > e1.getId()){
			return true;
		}
		else{
			return false;
		}
	}

	public String toString(){
		return this.id+"";
	}

}

public class SortableTest{
	public static void sortAll(Sortable s[]){
		 for(int i=0; i < s.length; i++){  
            for(int j=1; j < (s.length-i); j++){  
				if(s[j-1].compare(s[j])){
					Sortable temp = s[j];
					s[j]=s[j-1];
					s[j-1]=temp;
				}
			}
		}
	}
	public static void main(String args[]){
		Sortable s[] = new Sortable[3];
		s[0] = new Circle(5);
		s[1] = new Circle(2);
		s[2] = new Circle(7);
		sortAll(s);
		for(int i=0;i<s.length;i++){
			System.out.println(s[i].toString()+" ");
		}
		Sortable s1[] = new Sortable[3];
		s1[0] = new Employee(10);
		s1[1] = new Employee(9);
		s1[2] = new Employee(1);
		sortAll(s1);
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i].toString()+" ");
		}
	}
}