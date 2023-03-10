import java.util.ArrayList;
import java.util.List;

public class Lambdas2 {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();

		populatePeopleOfData(people);
		
		//asagidaki stream islemi ile ayni gorevi yapiyor.
		for(Person person : people) {
			if(person.getSsn() > 10) {
				System.out.println(person);
			}
		}

		people.stream() // bu isleme basladigmizda Stream list i cover eder = Stream<List<Person>>
			  .filter(person -> person.getSsn() > 10) // filter da type degismiyo!!!	//intermediate operations : filter, distinct, filter, map
			  .map(Person :: getFirstName) // type degisiyo burada...DIKKAT!!!
			  .forEach(System.out::println); // terminal operations : forearch, collect, reduce

	}

	public static void populatePeopleOfData(List<Person> people) {

		for (int i = 0; i < 20; i++) {

			Person person = new Person(i, "John" + (i + 1), "Doe" + (i + 1));
			people.add(person);
		}

	}

}
