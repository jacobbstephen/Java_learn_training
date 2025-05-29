package threads.autoSaveFeature;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		Runnable task =  () -> {
			System.out.println("Autosaving started");
			try {
				Thread.sleep(1000);
				System.out.println("Autosaving completed at " + java.time.LocalTime.now());
				
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		};
		
		scheduler.scheduleAtFixedRate(task, 2, 5, TimeUnit.SECONDS );
		
		Executors.newSingleThreadScheduledExecutor().schedule(() -> {
			scheduler.shutdown();
			System.out.println("Scheduler shutdown at " + java.time.LocalTime.now());
		},20 , TimeUnit.SECONDS);
	}
}
