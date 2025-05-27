package practice_assignment.question5;

public class Constructor {
	private int a = 1;
	public Constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public Constructor(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	
	
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		System.out.println("Value of a with default constructor => " + obj1.getA());
		
		Constructor obj2 = new Constructor(10);
		System.out.println("Value of a with Parameterized constructor => " + obj2.getA());

	}
	
	
	
}
