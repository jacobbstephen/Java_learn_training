package threads.downloadTask;

public class DownloadTask implements Runnable {
	public void run() {
		System.out.println("Simulating Downloading");
		for(int i = 0; i < 1000000000; i++) {}
		System.out.println("Downloading Completed.");
	}
}
