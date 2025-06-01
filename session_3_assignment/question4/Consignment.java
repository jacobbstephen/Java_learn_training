package session_3_assignment.question4;

public class Consignment {
	private Product products[] = new Product[10];
	private int index = 0;
	
	public void addProducts(Product product) {
		products[index++] = product;
	}
	
	public void showConsignmentDetails() {
		System.out.println("Consignment Details");
		System.out.println("----------------------------------");
		System.out.println();
		for(int i = 0; i < index; i++) {
			Product prod = products[i];
			prod.displayInfo();
			System.out.println("----------------------------------");
		}
	}
}
