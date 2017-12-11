class Mythread extends Thread {
	
	public void run(){
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		System.out.println("I am going to sleep");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I am Interrupted");
			e.printStackTrace();
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Mythread myTh = new Mythread();
		myTh.start();
		System.out.println("It came back to main");
		myTh.interrupt();
		System.out.println("End of Main Thread");
	}

}
