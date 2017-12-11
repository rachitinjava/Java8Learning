package com.learn.producerconsumer;

import java.util.Queue;

public class Consumer extends Thread{
	
	private int maxsize;
	private Queue<Integer> queue;
	
	public Consumer(int maxsize, Queue<Integer> queue,String name) {
		super(name);
		this.maxsize = maxsize;
		this.queue = queue;
	}

	
	public void run(){
		while(true){
		try {
			consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}


	private void consume() throws InterruptedException {
		synchronized(queue){
		while(queue.isEmpty()){
			System.out.println("Size of queue is empty waiting for Producer to produce...");
			queue.wait();
		}
		
		System.out.println("Consumer Consumed :: "+queue.remove());
		queue.notify();
		}
	}
	
	
	
	
}
