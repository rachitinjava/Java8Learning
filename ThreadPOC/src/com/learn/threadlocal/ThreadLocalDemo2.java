package com.learn.threadlocal;

import java.util.Date;

class MyThread extends Thread {
	
	//static Integer count = 0;
	
	private static ThreadLocal tl = new ThreadLocal(){
		protected Object initialValue(){
			return Math.random();
		}
	};
	
	public void run(){
	
		System.out.println("Thread " + Thread.currentThread().getName() +" is having the value "+ tl.get());
		
	}
	
}
public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		MyThread t11 = new MyThread();
		MyThread t12 = new MyThread();
		MyThread t13 = new MyThread();
		MyThread t14 = new MyThread();
		
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		
	}

}
