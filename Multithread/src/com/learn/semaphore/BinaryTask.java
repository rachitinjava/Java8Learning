package com.learn.semaphore;

import java.util.concurrent.Semaphore;

public class BinaryTask {

	private Semaphore sp;

	public BinaryTask(Semaphore sp) {
		this.sp = sp;
	}

	public void doTask(){
		
		try {
			sp.acquire();
			System.out.println("Thread "+Thread.currentThread().getName() +" acquired the permit...");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sp.release();
		System.out.println("Thread "+Thread.currentThread().getName() +" released the permit...");
	}
	
}
