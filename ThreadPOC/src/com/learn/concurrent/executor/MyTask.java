package com.learn.concurrent.executor;

public class MyTask implements Runnable{

	private String name;
	
	public MyTask(String name){
		this.name = name;
	}
	
	public void run(){
		System.out.println("Task "+name+ " is ran by thread :: "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task "+name+ " is completed by thread :: "+Thread.currentThread().getName());
	}
}
