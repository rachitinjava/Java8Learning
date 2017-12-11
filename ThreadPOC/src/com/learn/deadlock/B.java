package com.learn.deadlock;

public class B {

	synchronized public void t2(A a){
		System.out.println("I am in t2 method...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("Calling A's doSomething");
		a.doSomething();
	}
	
	
	synchronized public void doSomething() {
		System.out.println("I am in B's doSomething method");
	}

}
