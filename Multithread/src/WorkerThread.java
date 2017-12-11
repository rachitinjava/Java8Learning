
public class WorkerThread implements Runnable{
	
	private Display d;
	private String name;
	
	public WorkerThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish1(name);
	}
}
