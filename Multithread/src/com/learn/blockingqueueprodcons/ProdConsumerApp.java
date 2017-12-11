package com.learn.blockingqueueprodcons;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Produced :" + i);
			try {
				queue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	private final BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed" + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ProdConsumerApp {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);
		Thread t1 = new Thread(new Producer(queue));
		Thread t2 = new Thread(new Consumer(queue));
		
		t1.start();
		t2.start();
		
	}
}
