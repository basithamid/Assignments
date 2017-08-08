interface Sortable{
	public boolean compare(Sortable s);
}

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

class Employee implements Sortable{
	private int id;
	public Employee(int id){
		this.id = id;
	}
	public boolean compare(Sortable s){
		return true;
	}

}

public class SortableTest{
	public static void sortAll(Sortable s[]){
		for(int i=0; i<s.length;i++){
			for(int j=1;j<s.length-1;j++){
				if(s[j].compare(s[j-1])){
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
	}
}