package com.learn.concurrent.reenterentlocks;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

	static ReentrantLock l = new ReentrantLock();
	private String name;

	MyThread(String name){
		super(name);
		this.name=name;
	}
	
	public void run() {

		if (l.tryLock()) {
			System.out.println("This is main functionality run by ::" + Thread.currentThread().getName());
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
			l.unlock();
		} else {
			System.out.println("This is alternative functionality run by ::" + Thread.currentThread().getName());
		}

	}

}
