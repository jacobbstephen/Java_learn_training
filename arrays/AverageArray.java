package arrays;

import java.util.Scanner;

public class AverageArray {

	public static void main(String args[]) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i]; 
		}
		
		float avg = (float) sum / n;
		
			
		System.out.println("Average = " + avg);
		
		
	}
}
