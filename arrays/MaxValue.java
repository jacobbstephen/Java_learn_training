package arrays;
import java.util.Scanner;
public class MaxValue {
	public static void main(String args[]) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxElement = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > maxElement) {
				maxElement = arr[i];
			}
		}
		
		System.out.println("Max Element = " + maxElement);
		
	}
}
