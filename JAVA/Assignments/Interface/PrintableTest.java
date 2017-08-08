interface Printable{
	public void print();
}

class Employee implements Printable{
	public void print(){
		System.out.println("Employee class");
	}
}

class Circle implements Printable{
	public void print(){
		System.out.println("Circle class");
	}
}

public class PrintableTest{
	public static void printAll(Printable p[]){
		for(int i = 0; i<p.length;i++){
			p[i].print();
		}
	}
	public static void main(String[] args) {
		Printable p[] = new Printable[3];
		p[0] = new Employee();
		p[1] = new Circle();
		p[2] = new Employee();
		printAll(p);
	}
}