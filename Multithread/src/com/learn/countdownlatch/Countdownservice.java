package com.learn.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Countdownservice implements Runnable{
	
	private CountDownLatch latch;
	
	public Countdownservice(CountDownLatch latch) {
		super();
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("I am running by thread :: "+Thread.currentThread().getName() + "Latch count is "+latch.getCount());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		System.out.println("after executing task count is "+latch.getCount());
	}

}
