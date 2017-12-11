package com.learn.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class MainProg {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		
		Consumer consumer = new Consumer(4, queue, "Consumer");
		Producer producer = new Producer(queue,4,"Producer");
		
		producer.start();
		consumer.start();
		
	}

}
