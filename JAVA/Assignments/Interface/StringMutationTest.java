public class StringMutationTest{
	public static void changeString(String name){
		name = "Basit Hamid";
		System.out.println("String in changeString():"+name);
	}
	public static void changeString1(StringBuilder name){
		name.append(" Hamid");
		System.out.println("String in changeString():"+name);
	}
	public static void main(String args[]){
		String str = new String("Basit");
		System.out.println("String before mutation:"+str);
		StringMutationTest.changeString(str);
		System.out.println("String after mutation:"+str);

		//StringBuilder
		System.out.println("StringBuilder");
		StringBuilder str1 = new StringBuilder("Basit");
		System.out.println("String before mutation:"+str1);
		StringMutationTest.changeString1(str1);
		System.out.println("String after mutation:"+str1);


	}
}