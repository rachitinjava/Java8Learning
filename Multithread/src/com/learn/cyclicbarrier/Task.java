package com.learn.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable{
	
	private CyclicBarrier cb;

	public Task(CyclicBarrier cb) {
		super();
		this.cb = cb;
	}

	@Override
	public void run() {

		System.out.println("I am runing thread :"+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		System.out.println("exiting thread :"+ Thread.currentThread().getName());
	}
	
}
