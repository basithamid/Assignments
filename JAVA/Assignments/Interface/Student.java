package stud;
import fact.Faculty;
public class Student{
	public static int rollNo=10;
		
	public static void main(String args[]){
		System.out.println("Hello");
		System.out.println("Marks = "+Faculty.getStudentMarks(rollNo));
	}
}