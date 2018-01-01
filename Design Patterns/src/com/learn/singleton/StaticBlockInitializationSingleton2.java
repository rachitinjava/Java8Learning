package com.learn.singleton;

/*
 * This adds a exceptional handling mechanism to it.
 * 
 */
public class StaticBlockInitializationSingleton2 {

	private static StaticBlockInitializationSingleton2 instance;
	
	private StaticBlockInitializationSingleton2() {
	}
	
	static {
		try{
		instance = new StaticBlockInitializationSingleton2();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}
	
	public static StaticBlockInitializationSingleton2 getInstance(){
		return instance;
	}

}
