package com.learn.concurrent.reenterentlocks;

public class TryLockWithTimeApp {
	
	
	public static void main(String[] args) {
		
		TryLockTime l1 = new TryLockTime("First Thread");
		TryLockTime l2 = new TryLockTime("Second Thread");
		
		l1.start();
		l2.start();
	}
}
