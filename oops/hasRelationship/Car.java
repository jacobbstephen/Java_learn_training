package hasRelationship;

public class Car {
	Engine engine = new Engine();
	void drive() {
		engine.start();
		System.out.println("Driving..........");
	}
	
	
}
