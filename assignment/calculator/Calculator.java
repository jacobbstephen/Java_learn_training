package calculator;

public class Calculator {
	private int  a;
	private int b;
	public Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int add() {
		return a + b;
	}
	public int sub() {
		return a - b;
	}
	public int multiply() {
		return a * b;
	}
	public int divide() {
		return a / b;
	}
	
	public void printResult(int result) {
		System.out.println("Result = " + result);
	}
	
	
	public static void main(String args[]) {
		Calculator calc = new Calculator(20,10);
		// add
		int result = calc.add();
		calc.printResult(result);
		// sub
		result = calc.sub();
		calc.printResult(result);
		// mul
		 result = calc.multiply();
		calc.printResult(result);
		// div
		result = calc.divide();
		calc.printResult(result);
		
	}
}
