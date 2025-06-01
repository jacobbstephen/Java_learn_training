package session_3_assignment.question2;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic[] calculation = {new Addition(), new Subtraction(), new Multiplication(), new Division()};
		int res = calculation[0].process(100, 5);
		
		res = calculation[1].process(100, 5);
		res = calculation[2].process(100, 5);
		res = calculation[3].process(100, 5);
	}

}
