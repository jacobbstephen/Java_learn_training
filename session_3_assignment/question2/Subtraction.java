package session_3_assignment.question2;
public class Subtraction extends Arithmetic {
	@Override
	public int process(int a, int b) {
		format(a - b, FMT_STAR);
		return a - b;
	}
}
