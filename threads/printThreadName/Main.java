package threads.printThreadName;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a fixed Thread pool with 5 threads
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// Submit the task
		for(int i = 0; i < 5; i++) {
			int taskNumber = i;
			executorService.submit(() -> {
				System.out.println("Task " + taskNumber + " => running on thread: "  + Thread.currentThread().getName());
			});
		}
		
		// Shut down the executor
		executorService.shutdown();

	}

}
