package threads.scheduleTask.delayed;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService scheduler =  Executors.newScheduledThreadPool(1);
		
		System.out.println("Task Starting at " + java.time.LocalTime.now());
		
		Runnable task = () -> System.out.println("Task executed with 20 seconds delay at " + java.time.LocalTime.now());
		
		scheduler.schedule(task, 20, TimeUnit.SECONDS);
		
		scheduler.shutdown();

	}

}
