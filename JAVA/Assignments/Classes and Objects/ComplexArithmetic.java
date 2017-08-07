import java.lang.Math;

class ComplexNumber{
	private int real,imaginary;
	
	public ComplexNumber(){
		this.real=2;
		this.imaginary=3;
	}
	public ComplexNumber(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	public void setReal(int real){
		this.real=real;
	}
	public int getReal(){
		return this.real;
	}
	public void setImaginary(int imaginary){
		this.imaginary=imaginary;
	}
	public int getImaginary(){
		return this.imaginary;
	}

	public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2){
		ComplexNumber sum=new ComplexNumber();
		sum.setReal(num1.getReal()+num2.getReal());
		sum.setImaginary(num1.getImaginary()+num2.getImaginary());
		return sum;
	}
	
	public static ComplexNumber sub(ComplexNumber num1, ComplexNumber num2){
		ComplexNumber sum=new ComplexNumber();
		sum.setReal(num1.getReal() - num2.getReal());
		sum.setImaginary(num1.getImaginary() - num2.getImaginary());
		return sum;
	}
	
	public static ComplexNumber mult(ComplexNumber num1, ComplexNumber num2){
		ComplexNumber prod = new ComplexNumber();
		prod.setReal(num1.getReal() * num2.getReal());
		prod.setImaginary(num1.getImaginary() * num2.getImaginary() * (-1));
		return prod;
	}
	public static void swap(ComplexNumber num1, ComplexNumber num2){
		ComplexNumber temp=new ComplexNumber(0,0);	
		System.out.println("Before swapping");
		System.out.println("Number 1: "+ num1.getReal() + " " + num1.getImaginary() + "i");
		System.out.println("Number 2: "+ num2.getReal() + " " + num2.getImaginary() + "i");
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping");
		System.out.println("Number 1: "+ num1.getReal() + " " + num1.getImaginary() + "i");
		System.out.println("Number 2: "+ num2.getReal() + " " + num2.getImaginary() + "i");

	}
}

public class ComplexArithmetic{
	public static void main(String args[]){
		ComplexNumber num1=new ComplexNumber();
		ComplexNumber num2=new ComplexNumber(3,5);
		//findng sum of Complex Numbers
		ComplexNumber sum = ComplexNumber.add(num1,num2);
		System.out.println("The sum is: "+sum.getReal()+"  "+sum.getImaginary()+"i");
		//finding difference of Complex Numbers
		ComplexNumber diff = ComplexNumber.sub(num1,num2);
		System.out.println("The difference is: "+diff.getReal()+"  "+diff.getImaginary()+"i");
		//finding product of Complex Numbers
		ComplexNumber prod = ComplexNumber.mult(num1,num2);
		System.out.println("The product is: "+(prod.getReal() + prod.getImaginary()));
		ComplexNumber.swap(num1,num2);
	}
	
}