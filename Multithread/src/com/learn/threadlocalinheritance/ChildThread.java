package com.learn.threadlocalinheritance;

public class ChildThread extends Thread {

	public void run(){
		
		System.out.println("Child Thread accessing thread local :: "+ParentThread.tl.get());
		
	}
	
}
