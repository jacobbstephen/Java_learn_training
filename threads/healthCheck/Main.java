package threads.healthCheck;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		Runnable task =  () -> {
			System.out.println("Checking health of server at " + java.time.LocalTime.now());
			double num = Math.floor(Math.random() * 2);
			boolean isHealthy = ((int) num & 1) == 0;
			System.out.println(isHealthy ? "Server is healthy" : "Server is not healthy");
		};
		
		scheduler.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS );
		
		Executors.newSingleThreadScheduledExecutor().schedule(() -> {
			scheduler.shutdown();
			System.out.println("Scheduler shutdown at " + java.time.LocalTime.now());
		},20 , TimeUnit.SECONDS);

	}

}
