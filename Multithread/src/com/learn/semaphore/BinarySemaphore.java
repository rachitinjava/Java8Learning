package com.learn.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class BinarySemaphore {

	public static void main(String[] args) {
		Semaphore sp = new Semaphore(1);
		final BinaryTask task = new BinaryTask(sp);
		ExecutorService service = Executors.newFixedThreadPool(2);

		service.execute(new Runnable() {
			public void run() {

				task.doTask();

			}
		});

		service.execute(new Runnable() {
			public void run() {

				task.doTask();

			}
		});
		
		service.shutdown();

	}

}
