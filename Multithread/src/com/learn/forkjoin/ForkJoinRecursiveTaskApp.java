package com.learn.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinRecursiveTaskApp {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(4);
		MyRecursiveTask recursiveTask = new MyRecursiveTask(128);
		pool.invoke(recursiveTask);
	}

}
