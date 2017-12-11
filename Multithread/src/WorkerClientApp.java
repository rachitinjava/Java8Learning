
public class WorkerClientApp {

	public static void main(String[] args) {

		Display d = new Display();
		Thread t1 = new Thread(new WorkerThread(d,"Rachit"));
		Thread t2 = new Thread(new NewWorkerThread(d,"Shah"));
		
		t1.start();
		t2.start();
	}

}
