
public class Display {

	public synchronized static void wish2(String name){
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Evening : "+name);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized static void wish1(String name){
		for (int i = 0; i < 10; i++) {
			System.out.println("Good Morning : "+name);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
