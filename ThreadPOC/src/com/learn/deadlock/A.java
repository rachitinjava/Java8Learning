package com.learn.deadlock;

public class A {
	
	synchronized public void t1(B b){
		System.out.println("I am in t1 method...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Calling B's doSomething");
		b.doSomething();
	}
	
	synchronized public void doSomething(){
		System.out.println("I am in A's Something method");
	}

}
