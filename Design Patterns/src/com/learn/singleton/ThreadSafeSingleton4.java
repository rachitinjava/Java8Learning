package com.learn.singleton;

/*
 * This adds thread safety by synchronization. However, there will be cost involved with the synchronized method
 * 
 */
public class ThreadSafeSingleton4 {

	private static ThreadSafeSingleton4 instance;

	private ThreadSafeSingleton4() {
	}

	public static synchronized ThreadSafeSingleton4 getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton4();
		}
		return instance;
	}

}
