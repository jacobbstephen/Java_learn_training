package threads.bookTicket;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBooking {
	public static void main(String[] args) {
		TicketCounter counter = new TicketCounter();
		ExecutorService executor = Executors.newFixedThreadPool(6);
		
		executor.submit(() -> counter.bookTicket("User 1"));
		executor.submit(() -> counter.bookTicket("User 2"));
		executor.submit(() -> counter.bookTicket("User 3"));
		executor.submit(() -> counter.bookTicket("User 4"));
		executor.submit(() -> counter.bookTicket("User 5"));
		executor.submit(() -> counter.bookTicket("User 6"));
		
		executor.shutdown();
	}
}
