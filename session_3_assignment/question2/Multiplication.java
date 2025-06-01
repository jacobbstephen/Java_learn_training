package session_3_assignment.question2;
public class Multiplication extends Arithmetic {
	@Override
	public int process(int a, int b) {
		format(a * b, FMT_EQUALS);
		return a * b;
	}
}
