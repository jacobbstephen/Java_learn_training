package threads.bookTicket;

public class TicketCounter {
	private int ticketCount = 4;
	
	public synchronized void bookTicket(String userName) {
		if(ticketCount > 0) {
			System.out.println(userName + " is booking ticket");
			try {
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			ticketCount--;
			System.out.println("Ticket Booked Successfully => Tickets left: " + ticketCount);
			
		}else {
			System.out.println("Hey " + userName + " Sorry, we don't have any tickets left");
		}
	}
}
