package com.learn.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolApp {

	public static void main(String[] args) {

		MyTask mt = new MyTask("Rachit");
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(mt);
		service.submit(mt);
		service.submit(mt);
		service.submit(mt);
		service.submit(mt);
	
	
	
	}

}
