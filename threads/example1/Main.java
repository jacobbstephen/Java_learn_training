package threads.example1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Thread1 t1 = new Thread1();
		t1.start();
		System.out.println("Thread 1 Created and started");
		Thread2 t2 = new Thread2();
		t2.start();
		System.out.println("Thread 2 Created and started");
		Thread3 t3 = new Thread3();
		t3.start();
		System.out.println("Thread 3 Created and started");
		System.out.println("Program Completed");
	}
}
