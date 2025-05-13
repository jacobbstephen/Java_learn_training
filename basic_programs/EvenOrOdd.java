package programs;

import java.util.Scanner;
public class EvenOrOdd {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		
		if(n % 2 == 1 ) System.out.println("Odd");
		else System.out.println("Even");
		
	}
}
