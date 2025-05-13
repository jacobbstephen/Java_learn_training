package programs;

public class Loops {
	public static void main (String args []) {
		System.out.print("Printing numbers using for loop: ");
		for(int i = 1; i <= 100; i++) System.out.print(i + " ");
		System.out.println();
		
		System.out.print("Printing numbers using while loop: ");
		int i = 1;
		while( i <= 100) {
			
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		System.out.print("Printing numbers using do-while loop: ");
		
		int j = 1;
		do {
			System.out.print(j + " ");
			
			j++;
			
		}while(j <= 100);
		System.out.println();
		
		
	}
}
