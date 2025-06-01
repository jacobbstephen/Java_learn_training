package session_3_assignment.question2;
public class Addition extends Arithmetic {
	@Override
	public int process(int a, int b) {
		format(a + b, FMT_UNDERSCORE);
		return a * b;
	}
}
