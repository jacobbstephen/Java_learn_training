package session_3_assignment.question4;

public class Product extends Item{
	private String productCode;
	public Product(String productName, double price, String productCode) {
		super(productName, price);
		this.productCode = productCode;
	}
	public String getProductCode() {
		return productCode;
	}
	@Override 
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Product code: " + productCode);
	}
	
}
