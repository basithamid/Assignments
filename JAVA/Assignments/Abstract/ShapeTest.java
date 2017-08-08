abstract class Shape{
	abstract public void draw();
}

class Point extends Shape{
	public void draw(){
		System.out.println("Draw Point");
	}
}

class Line extends Shape{
	public void draw(){
		System.out.println("Draw Line");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Draw Circle");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("Draw Rectangle");
	}
}


class Cube extends Shape{
	public void draw(){
		System.out.println("Draw Cube");
	}
}

public class ShapeTest{
	public static void main(String args[]){
		Shape shapes[] = new Shape[5];
		shapes[0] = new Point();
		shapes[1] = new Line();
		shapes[2] = new Circle();
		shapes[3] = new Rectangle();
		shapes[4] = new Cube();
		for(int i = 0; i<5; i++){
			shapes[i].draw();
		}
	}
}
