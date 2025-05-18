package assignment2;

public class CalculatorUI {
	public  void printResult(int result) {
		System.out.println("Result = " + result);
	}
	public static void main(String args[]) {
		Parameter p = new Parameter(20,10,'/');
		p.compute();
		CalculatorUI c = new CalculatorUI();
		c.printResult(p.getResult());
	}
}
