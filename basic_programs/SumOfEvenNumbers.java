package programs;

public class SumOfEvenNumbers {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 2; i <= 50; i += 2) {
			sum += i;
		}
		
		System.out.println("Sum = " +  sum);
	}
}
