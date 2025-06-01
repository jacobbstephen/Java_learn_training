package session_3_assignment.question4;

public class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void displayInfo() {
		System.out.println("Item Name: " + this.name);
		System.out.println("Price:  $" + this.price);
	}
}
