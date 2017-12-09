package com.poc.lambda;

public class RunnableLambda {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable(){
			@Override
			public void run(){
			
				System.out.println("Old School Run Call...");
			}
		
		};
		
		Runnable r2 = ()-> System.out.println("New School Run Call...");
		
		Thread t1= new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}
	
	
}
