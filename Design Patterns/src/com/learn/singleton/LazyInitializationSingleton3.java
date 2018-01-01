package com.learn.singleton;

/*
 * This adds a lazy initialization  of object. However, suitable for only
 * single threaded environment.
 * 
 */
public class LazyInitializationSingleton3 {

	private static LazyInitializationSingleton3 instance;

	private LazyInitializationSingleton3() {
	}

	public static LazyInitializationSingleton3 getInstance() {

		if (instance == null) {
			instance = new LazyInitializationSingleton3();
		}

		return instance;
	}

}
