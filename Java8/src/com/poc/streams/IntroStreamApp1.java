package com.poc.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Rachit Shah :: rachitinjava@gmail.com
 *
 */
public class IntroStreamApp1 {

	public static void main(String[] args) {

		/*
		 * FIRST EXAMPLE :: stream() produces sequence of elements. findFirst()
		 * returns Optional if first element is found or Empty Optional if
		 * element is not found ifPresent() will execute the consume method of
		 * Interface Consumer. It takes a Lambda Expression.
		 */
		
		
		Arrays.asList("a", "b", "c").stream().findFirst().ifPresent(s -> {
			System.out.println("I am inside consume method");
			System.out.println(s);
		});

		
		/*
		 * SECOND EXAMPLE 
		 * Calling the method stream() on a list of objects
		 * returns a regular object stream. But we don't have to create
		 * collections in order to work with streams. Just use Stream.of() to
		 * create a stream from a bunch of object references.
		 */
		Stream.of("Rachit", "b", "c").findFirst().ifPresent(System.out::println);
		
	}

}
