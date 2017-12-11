package com.learn.concurrent.executor;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {

		System.out.println("Callable Task is started by :: "+ Thread.currentThread().getName());
		
		Thread.sleep(4*1000);
		
		System.out.println("Callable Task is ended by :: "+ Thread.currentThread().getName());
		return 1234;
	}

}
