package com.learn.singleton;

/*
 * This is eager initialization. It can be used if your object is consuming less resources. However, the object
 * creation is happened at the time of class loading. Wheater or not you call the getInstance() single copy is already loaded
 * into the memory.
 * 
 * Also, it does not provide any mechanism for exception handling.
 */
public class EagerInitializationSingleton1 {

	private static final EagerInitializationSingleton1 instance = new EagerInitializationSingleton1();
	
	private EagerInitializationSingleton1(){
	}
	
	public static EagerInitializationSingleton1 getInstance(){
		return instance;
	}
	
}
