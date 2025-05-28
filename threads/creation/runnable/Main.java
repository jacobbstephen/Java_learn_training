package threads.creation.runnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread());
		t1.start();
	}

}
