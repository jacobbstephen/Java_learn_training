package threads.example1;

public class Thread1  extends Thread{
	public void run() {
		for(int i = 0; i < 1000000000; i++) {
			
		}
		
		System.out.println("Thread 1 Done execution");
	}
}
