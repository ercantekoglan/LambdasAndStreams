import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Trevor Page");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Someone");
		
		Collections.sort(names);
		// reverse icin Comparable da kullanabiliriz
		printListToConsole(names);
		
		System.out.println("---------");
		
		Collections.sort(names, new Comparator<String>() {
// ****** Comparator a tikladiginda 
// @FunctionalInterface goreceksin bu da lambda ile kullanabilecegini gosterir.
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
				
			}});
// ayni sort islemini lambde ile yapiyoruz
		//uzun yol				method signature			return 
		Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));
		
		// kisa yol = FunctionalInterface de tanimli sadece bir abstract method oldugu icin java neyi kullanacagini biliyor
		// bu  yuzden parametrelerde data type belirmtek zorunda degilsin
		Collections.sort(names, (o1,o2) -> o2.compareTo(o1));
		
		//daha uzun yol
		Collections.sort(names, (o1,o2) -> {
			if(o2 != null && o1 != null) {
				return o2.compareTo(o1);
			}
			 return 0;
		});
		
		printListToConsole(names);
	}

	public static void printListToConsole(List<String> names) {
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
