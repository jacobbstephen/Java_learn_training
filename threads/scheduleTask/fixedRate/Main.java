package threads.scheduleTask.fixedRate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Task is starting at " + java.time.LocalTime.now());
		System.out.println("After 2 seconds");
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		Runnable task = () -> System.out.println("Task is repeated at " + java.time.LocalTime.now());
		service.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS);


		Executors.newSingleThreadScheduledExecutor().schedule(() -> {
			service.shutdown();
			System.out.println("Scheduler shutdown at " + java.time.LocalTime.now());
		}, 30, TimeUnit.SECONDS);
		
	}

}
