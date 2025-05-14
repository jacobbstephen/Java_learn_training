package innerClass.staticInnerClass;

public class Outer {
	static int x = 10;
	static  class Inner{
		void display() {
			System.out.println("Value of X = " + x);
		}
	}
}
