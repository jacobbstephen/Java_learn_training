package innerClass.nonStatic;

public class Main {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}
