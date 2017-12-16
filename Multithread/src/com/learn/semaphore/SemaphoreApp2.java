package com.learn.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreApp2 {

	public static void main(String[] args) {

		Semaphore sp = new Semaphore(5);
		ExecutorService service = Executors.newFixedThreadPool(10);

		Runnable longRunnableTask = new Runnable() {
			public void run() {
				boolean permit = false;
				try {
					permit = sp.tryAcquire(1, TimeUnit.SECONDS);

					if (permit) {
						System.out
								.println("Thread " + Thread.currentThread().getName() + " has acquired the permit...");
						Thread.sleep(3000);

					} else {
						System.out.println(
								"Thread " + Thread.currentThread().getName() + " is not able to get the permit...");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					if (permit) {
						sp.release();
					}
				}
			}
		};

		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		service.execute(longRunnableTask);
		
		service.shutdown();
	}

}
