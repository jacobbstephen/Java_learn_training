package practice_set_3.advanced.strings;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Box");
		stringList.add("Arjun");
		stringList.add("Abhiram");
		stringList.add("Dog");
		stringList.add("Cat");
		
		System.out.println(stringList);
		
		
		// lambda function to sort the list of strings
		Collections.sort(stringList, (s1, s2) -> s2.compareTo(s1));
		System.out.println(stringList);
		
		// lambda function to print names that start with A
		stringList.forEach(element -> {
			if(element.startsWith("A")) {
				System.out.print(element + " ");
			}
		});
	}

}
