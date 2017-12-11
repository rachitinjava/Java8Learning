package com.learn.concurrent.reenterentlocks;

public class ReentrantLockTryLockApp {

	public static void main(String[] args) {

		MyThread mt1 = new MyThread("First Thread");
		MyThread mt2 = new MyThread("Second Thread");
		
		mt1.start();
		mt2.start();
		
	}

}
