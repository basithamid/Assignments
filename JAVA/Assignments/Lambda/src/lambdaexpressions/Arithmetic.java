package lambdaexpressions;

import java.util.Scanner;

public class Arithmetic {

	public static void operation(MathInterface math){
		System.out.println(math.calculate(1, 2));
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MathInterface<Integer> add = (a, b)-> a+b;
		operation(add);
				
	}

}
