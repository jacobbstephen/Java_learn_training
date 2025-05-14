package practice_set_3.intermediate.shape;

public class Main {
	public static void main(String args[]) {
		Shape s = new Shape() {
			
			public void display() {
				System.out.println("Abstract Shape class is implemented by Main class");
			}
		};
		
		s.display();
	}
}
