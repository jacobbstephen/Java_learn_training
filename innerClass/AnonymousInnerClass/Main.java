package innerClass.AnonymousInnerClass;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal() {
			void makeSound() {
				System.out.println("Animal makes sound........");
			}
		};
		
		a.makeSound();

	}

}
