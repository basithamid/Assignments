package file;
import java.io.*;
public class Assignment4 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis1 = new FileInputStream("D:/GIT/Assignments/JAVA/Assignments/10_Generics.docx");
		FileInputStream fis2 = new FileInputStream("D:/GIT/Assignments/JAVA/Assignments/08_multithreading.docx");
		FileInputStream fis3 = new FileInputStream("D:/GIT/Assignments/JAVA/Assignments/07_exception_handling.docx");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		SequenceInputStream sis1 = new SequenceInputStream(sis, fis3);
		int i;
		while((i=sis1.read())!=-1){
			System.out.print((char)i);
		}
		fis1.close();
		fis2.close();
		fis3.close();
		sis.close();
		sis1.close();
	}

}
