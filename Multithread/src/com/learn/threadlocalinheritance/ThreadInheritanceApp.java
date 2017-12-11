package com.learn.threadlocalinheritance;

public class ThreadInheritanceApp {

	public static void main(String[] args) {

		ParentThread pt = new ParentThread();
		
		pt.start();
		System.out.println("Main thread accessing the thread local value "+ParentThread.tl.get());
		
	}

}
