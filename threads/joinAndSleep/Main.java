package threads.joinAndSleep;

public class Main {
	public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            System.out.println("Worker thread starting...");

            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Worker thread finished after 3 seconds");
        });
        System.out.println("Worker");
        worker.start();

        System.out.println("Main thread waiting for worker to finish...");

        try {
            worker.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread resumes after worker is done.");
    }
}
