package com.learn.deadlock;

public class Deadlock extends Thread{

	private A a = new A();
	private B b = new B();
	
	public void worker(){
		this.start();
		System.out.println(Thread.currentThread().getName()+" Calling t1 method...");
		a.t1(b);
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"  Calling t2 method...");
		b.t2(a);
	}
	
	
	public static void main(String[] args) {
		Deadlock deadlock = new Deadlock();
		deadlock.worker();
	}
}
