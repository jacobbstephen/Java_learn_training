package exceptions.basic.arithmetic;

public class Main {
	public static void main(String args[]) {
		int a = 10;
		int b = 0;
		
		try {
			float result = a / b;
			System.out.println("Result = " + result);
		}catch (ArithmeticException e){
			System.out.println("Cannot Divide by ZERO[0]");
		}
		finally {
			System.out.println("Program Terminated.");
		}
	}
}
