package assignment2;

public class Parameter {
	private int a;
	private int b;
	private int result;
	private char operator;
	Parameter(int a, int b, char operator){
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
	
	
	public int getResult() {
		return result;
	}

	public void compute() {
		if(this.operator == '+') this.result = a + b;
		else if(this.operator == '-') this.result = a - b;
		else if(this.operator == '*') this.result = a * b;
		else if(this.operator == '/') this.result = a / b;
		
	}
}
