package com.learn.concurrent.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApp {

	public static void main(String[] args) {

		MyTask[] myTaskArray = { new MyTask("Rachit"), new MyTask("Shah"), new MyTask("Asha"), new MyTask("Payal"),
				new MyTask("Prasham"), new MyTask("Prisha"), new MyTask("Pintu"), };

		ExecutorService ec = Executors.newFixedThreadPool(3);

		for (MyTask mta : myTaskArray) {
			ec.submit(mta);
		}
		
		ec.shutdown();

	}

}
