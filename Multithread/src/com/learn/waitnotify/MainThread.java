package com.learn.waitnotify;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("I am in main thread");
		
		MyThread mt = new MyThread();
		mt.start();
		Thread.sleep(100);
		synchronized(mt){
		try {
			mt.wait(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(mt.total);
		}
	}

}
