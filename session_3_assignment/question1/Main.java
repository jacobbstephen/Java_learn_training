package session_3_assignment.question1;

public class Main {
	public static void main(String[] args) {
		Arithmetic[] calculation = {new Addition(), new Subtraction(), new Multiplication(), new Division()};
		System.out.println("Result after Addition: " + calculation[0].process(100, 5));
		System.out.println("Result after Subtraction: " + calculation[1].process(100, 5));
		System.out.println("Result after Multiplication: " + calculation[2].process(100, 5));
		System.out.println("Result after Division: " + calculation[3].process(100, 5));
	}
}
