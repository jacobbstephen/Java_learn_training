package threads.downloadTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DownloadTask dt = new DownloadTask();
		Thread t1 = new Thread(dt);
		t1.start();
	}

}
