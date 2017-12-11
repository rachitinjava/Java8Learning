package com.learn.producerconsumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
	
	private Queue<Integer> queue;
	private int maxsize;
	
	public Producer(Queue<Integer> queue, int maxsize,String name) {
		super(name);
		this.queue = queue;
		this.maxsize = maxsize;
	}
	
	public void run(){
		int i=0;
		 while(i<10){
			 try {
				produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 i++;
		 }
	}
	private void produce() throws InterruptedException{
		
		synchronized(queue){
		while(queue.size()==maxsize){
			System.out.println("Size of queue is full and waiting for consumer to consume...");
				queue.wait();
		}	
		Random random = new Random();
		int nextInt = random.nextInt();
		System.out.println("Producer Produced :: "+nextInt);
		queue.add(nextInt);
		queue.notify();
		}
		
	}
	
}
