package file;
import java.io.*;
public class Assignment1 {

	public static void main(String[] args) throws Exception {
		File file = new File("D:/GIT/Assignments/JAVA/Assignments/10_Generics.docx");
		FileInputStream fis = new FileInputStream(file);
		File outputFile = new File("D:/GIT/Assignments/JAVA/Assignments/file.docx");
		FileOutputStream fos = new FileOutputStream(outputFile);
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		do{
			i = fis.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		fos.write(String.valueOf(sb).getBytes());
		fos.flush();
		fos.close();
	}

}
