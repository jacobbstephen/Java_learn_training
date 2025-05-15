package practice_set_3.advanced.upperCase;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("kannuz");
		names.add("jacob");
		names.add("jeev");
		names.add("Abhiram");
		names.add("vidhya");
		
		names.forEach((name) -> {
			System.out.print(name.toUpperCase() + "  ");
		});
		
		
		
	}

}
