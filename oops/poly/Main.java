package oops.poly;

public class Main {
	
	public static  void testSound(Animal a) {
		a.makeSound();
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		testSound(a);
		testSound(d);
		testSound(c);
		

	}

}
