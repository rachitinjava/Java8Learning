package com.learn.threadpoolexecutor;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class RunnableOne implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadPoolExecutorApp {

	public static void main(String[] args) {

		RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler(){

			@Override
			public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
				System.out.println(threadPoolExecutor.getQueue().remainingCapacity());
				System.out.println(runnable.toString() + "is rejected");
			}
			
		};
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(3);
		ExecutorService service = new ThreadPoolExecutor(2, 4, 5, TimeUnit.SECONDS, queue, rejectedExecutionHandler);
		RunnableOne r = new RunnableOne();
		service.execute(r);
		service.execute(r);
		
		service.execute(r);
		System.out.println("after third insertion"+queue.remainingCapacity());
		
		service.execute(r);
		System.out.println("after fourth insertion"+queue.remainingCapacity());
		
		service.execute(r);
		System.out.println("after fifth insertion"+queue.remainingCapacity());
		
		service.execute(r);
		service.execute(r);
		service.execute(r);
		service.execute(r);
		
		
		List<Runnable> runList = service.shutdownNow();
		System.out.println("Awaited Thread"+runList.size());
		
	}

}
