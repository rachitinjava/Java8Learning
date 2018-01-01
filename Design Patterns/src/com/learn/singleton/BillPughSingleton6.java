package com.learn.singleton;

/*
 * Notice the private inner static class that contains the instance of the singleton class. 
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and only 
 * when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
 * 
 */
public class BillPughSingleton6 {

	private BillPughSingleton6() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton6 INSTANCE = new BillPughSingleton6();
	}

	public static BillPughSingleton6 getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
