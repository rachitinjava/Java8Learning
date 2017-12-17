package com.poc.streams;

import java.util.stream.Stream;

public class ProcessingOrderStreamApp4 {

	public static void main(String[] args) {

		/*Example 1*/
		Stream.of("a", "b", "c").filter(s -> {
			System.out.println(s);
			return true;
		}).forEach(System.out::println);

		/*Example 2*/
		
		Stream.of("a","b","c").map(s-> {
			System.out.println("Mapping --> "+s);
			return s.toUpperCase();
		}).anyMatch(p-> {
			System.out.println("Matching --> "+p);
			return p.equals("B");
		});
		
	}

}
