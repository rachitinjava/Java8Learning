package com.poc.streams;

import java.util.stream.Stream;

public class ProcessingOrderStreamApp4 {

	public static void main(String[] args) {

		Stream.of("a", "b", "c").filter(s -> {
			System.out.println(s);
			return true;
		}).forEach(System.out::println);

	}

}
