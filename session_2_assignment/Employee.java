package session_2_assignment;

public class Employee {
	private static int objectCount = 0;
	
	public Employee() {
		objectCount++;
		System.out.println("Object " + objectCount + " is created");
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		System.out.println("Total Number of objects created is: " + Employee.objectCount);
		
	}
	
}

