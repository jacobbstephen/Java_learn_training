package oops;

public class CarClass {
	private String brand;
	private String model;
	private String year;
	private int  speed;
	
	CarClass(String brand, String model, String year, int  speed){
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.year = year;
	}
	
	// getters
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// Setters
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// Accelerate 
	public void accelerate(int increaseBy) {
		speed += increaseBy;
		System.out.println("Speed of the car is " + speed);
	}
	
	
	public static void main(String args[]) {
		CarClass car = new CarClass("Ford","Figo", "2012", 40);
		System.out.println(car.getBrand() + " " + car.getModel() + ": " + car.getYear() + " Speed: " + car.getSpeed());
		car.accelerate(10);
		System.out.println(car.getBrand() + " " + car.getModel() + ": " + car.getYear() + " Speed: " + car.getSpeed());
		
		
	}
}
