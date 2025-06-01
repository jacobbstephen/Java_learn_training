package session_3_assignment.question4;

public class ConsignmentApp {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop", 65000, "P1");
		Product p2 = new Product("TV", 45000, "P2");
		Product p3 = new Product("Monitor", 8000, "P3");
		Product p4 = new Product("KeyBoard", 1000, "P4");
		
		// add products to consignment
		Consignment obj = new Consignment();
		obj.addProducts(p1);
		obj.addProducts(p2);
		obj.addProducts(p3);
		obj.addProducts(p4);
		
		// Print details
		obj.showConsignmentDetails();
	}
}
