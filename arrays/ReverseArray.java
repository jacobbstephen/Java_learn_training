package arrays;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String args[]) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0, end = n - 1;
		int temp = arr[start];
		while(start < end) {
			 temp = arr[start];
			 arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
		}
		
		System.out.println("Reversed Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
