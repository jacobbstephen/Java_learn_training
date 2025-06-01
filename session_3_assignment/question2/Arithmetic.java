package session_3_assignment.question2;

public abstract class Arithmetic implements ArithmeticFormater {
	public abstract int process(int a, int b);
	public void format(int result, char symbol) {
		System.out.print(symbol);
		System.out.print(" " + result + " ");
		System.out.println(symbol);
	}
	
}
