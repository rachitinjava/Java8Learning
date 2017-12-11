package com.learn.concurrent.reenterentlocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockTime extends Thread {

	static ReentrantLock l = new ReentrantLock();
	String name;
	
	public TryLockTime(String name){
		super(name);
		this.name = name;
	}
	
	public void run(){
		do{
			try {
				if(l.tryLock(5000, TimeUnit.MILLISECONDS)){
					System.out.println("Thread :: "+ Thread.currentThread().getName()+ " got the lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println("Thread :: "+ Thread.currentThread().getName()+" releases the lock...");
					break;
				}
				else{
					System.out.println("Thread :: "+ Thread.currentThread().getName()+" didn't get lock. Hence, trying again...." );
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		while(true);
	}
	
	
	
}
