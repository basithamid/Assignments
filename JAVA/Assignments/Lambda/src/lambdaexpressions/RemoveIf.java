package lambdaexpressions;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Collection;

public class RemoveIf {
	static ArrayList<String> names = new ArrayList<>();
	public static void remove(String names[], Predicate p){
		for(String name:names){
//			names.removeIf(p.test(name));
		}
	}
	public static void main(String[] args) {
		names.add("Basit");
		names.add("Anand");
		names.add("Ananda");
		names.add("Ananya");
		names.removeIf((name)-> name.length()%2==1);
		for(String name:names){
			System.out.println(name);
		}
//		Predicate<String> namePredicate = (String name)->name.length()%2==1;
//		remove(names,namePredicate);
	}

}
