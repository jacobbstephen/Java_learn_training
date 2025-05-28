package threads.factorial;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Factorial {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		// TODO Auto-generated method stub
		int num = 5;
		// Define the task
		Callable<Long> factTask = () -> {
			long result = 1;
			for(int i = 2; i <= num; i++) result *= i;
			return result;
		};
		
		// Create the Executor Service
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// Submit the task
		Future<Long> future = executorService.submit(factTask);
		
		// Use the future to get the result
		Long factorial = future.get();
		// print the result
		System.out.println("Factorial of " + num  + " is " + factorial );
		
//		Shutdown the executor
		
		executorService.shutdown();
		
		

	}

}
