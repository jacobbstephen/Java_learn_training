package exceptions.intermediate.multipleTryCatch;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = new int[5];	
		String str = "-123";
		try {
			System.out.println(arr[4]);
			int  num = Integer.parseInt(str);
			System.out.println(num);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Cannot access an index  higher than the indexes provided for the array.");
		}catch(NumberFormatException e) {
			System.out.println("Cannot convert string into an integer");
		}catch(Exception e) {
			System.out.println("Something went wrong.");
		}

	}

}
