package arrays;

import java.util.Scanner;

public class Transpose {
	public static void main(String args[]) {
		int matrix[][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int transpose[][] = new int [3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				transpose[j][i]  = matrix[i][j];
			}
		}
		System.out.println("Transposed Array: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
}
