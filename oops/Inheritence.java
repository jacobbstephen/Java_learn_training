package oops;

class Animal{
	public void makeSound() {
		System.out.println("Make Animal Sound");
	}
}


class Dog extends Animal{
	public void makeSound() {
		System.out.println("bowww........bowwww!!!");
	}
}

class Cat extends Animal{
	public void makeSound() {
		super.makeSound();
		System.out.println("Meowww........Meowww!!!");
	}
}

public class Inheritence {
	public static void main(String args[]) {
		Cat obj1 = new Cat();
		Dog obj2 = new Dog();
		
		obj1.makeSound();
		obj2.makeSound();
	}
}
