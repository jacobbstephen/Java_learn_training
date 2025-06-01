package session_3_assignment.question2;
public class Division extends Arithmetic {
	@Override
	public int process(int a, int b) {
		format(a / b, FMT_DOLLAR);
		return a / b;
	}
}
