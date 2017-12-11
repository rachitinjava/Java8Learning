package com.learn.concurrent.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newCachedThreadPool();
		CallableThread ct = new CallableThread();
		
		Future<Integer> f1 = service.submit(ct);
		Future<Integer> f2 = service.submit(ct);
		
		while(!f1.isDone()){
			System.out.println("waiting...");
			Thread.sleep(1000);
		}
		System.out.println(f1.get());
		System.out.println(f2.isDone());
		
	}

}
