package innerClass.nonStatic;

public class Outer {
	int x = 10;
	class Inner{
		void display() {
			System.out.println("Value of X = " + x);
		}
	}
}
