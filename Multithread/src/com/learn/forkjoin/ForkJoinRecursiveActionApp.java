package com.learn.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinRecursiveActionApp {

	public static void main(String[] args) {

		ForkJoinPool pool = new ForkJoinPool(4);
		
		MyRecursiveAction action = new MyRecursiveAction(24);
		pool.invoke(action);
	}

}
