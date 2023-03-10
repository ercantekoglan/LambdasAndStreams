import java.util.ArrayList;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		populateNames(names);
		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		names.parallelStream()
		     .forEach(name -> System.out.println(name));
	}

	private static void populateNames(List<String> names) {
		names.add("Nahla Kirkland");
		names.add("Charly Gay");
		names.add("Jamie-Lee Swan");
		names.add("George Mckeown");
		names.add("Deen Markham");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
	}

}