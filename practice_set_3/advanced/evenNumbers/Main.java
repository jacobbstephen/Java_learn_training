package practice_set_3.advanced.evenNumbers;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		nums.forEach((num) -> {
			if((num & 1) == 1) {
				System.out.print(num + " "); 
			}
		});

	}

}
