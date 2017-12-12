package com.learn.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Countdownlatchapp {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		final CountDownLatch latch = new CountDownLatch(3);
		service.execute(new Countdownservice(latch));
		service.execute(new Countdownservice(latch));
		service.execute(new Countdownservice(latch));
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			service.shutdown();
		}
		
		System.out.println(" Main thread latch.count() "+latch.getCount());
		
	}

}
