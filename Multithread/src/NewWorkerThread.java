
public class NewWorkerThread implements Runnable{

	private Display d;
	private String name;
	
	public NewWorkerThread(Display d,String name) {
		super();
		this.d = d;
		this.name=name;
	}

	@Override
	public void run() {
		d.wish2(name);
	}

}
