package com.learn.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cyclicbarrierservice {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		CyclicBarrier cb = new CyclicBarrier(3,new Runnable(){
			@Override
			public void run() {

				System.out.println("I am in cb run method");
				
			}
			
		});
		service.execute(new Task(cb));
		service.execute(new Task(cb));
		service.execute(new Task(cb));
		
		System.out.println("I am in main method");
		
	}

}
