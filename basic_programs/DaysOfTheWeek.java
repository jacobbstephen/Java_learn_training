package programs;
import java.util.Scanner;

public class DaysOfTheWeek {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to find the Day [1 - 7]: ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.println(" 1  => Monday");
				break;
				
			case 2:
				System.out.println(" 2  => Tuesday");
				break;
				
			case 3:
				System.out.println(" 3  => Wednesday");
				break;
				
			case 4:
				System.out.println(" 4  => Thursday");
				break;
				
			case 5:
				System.out.println(" 5  => Friday");
				break;
				
			case 6:
				System.out.println(" 6  => Saturday");
				break;
			
			default:
				System.out.println(" 7 => Sunday");
				
			
		}
	}
}
