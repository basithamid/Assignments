public class StringTest{
	public static void main(String args[]){
		String str = "Basit";
		String str1 = "Basit";
		String str2 = new String("Basit");
		String str3 = new String("Basit");
		//check between string str and str1
		// if(str==str1){
		// 	System.out.println("Strings declared without new have same reference");
		// }
		// else{
		// 	System.out.println("Strings declared without new do not have same reference");
		// }
		// if(str.equals(str1)){
		// 	System.out.println("Strings have same content");
		// }
		// else{
		// 	System.out.println("Strings do not have same content");	
		// }
		// str1 = str1+" Hamid";
		// System.out.println("After modifying the strings");
		// if(str==str1){
		// 	System.out.println("Strings declared without new have same reference");
		// }
		// else{
		// 	System.out.println("Strings declared without new do not have same reference");
		// }
		//check between string str2 and str3
		if(str3.equals(str2)){
			System.out.println("Strings have same content");
		}
		if(str3!=str2){
			System.out.println("References are different");
		}
	}
}