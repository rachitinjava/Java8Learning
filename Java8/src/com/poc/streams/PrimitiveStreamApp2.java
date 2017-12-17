package com.poc.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Rachit Shah
 * 
 *         This is about primitive streams
 *
 */
public class PrimitiveStreamApp2 {

	public static void main(String[] args) {

		/* First Example */

		IntStream.rangeClosed(1, 9).forEach(System.out::println);

		/* Second Example */

		Arrays.stream(new int[] { 1, 2, 3 }).map(s -> 2 * s + 1).average().ifPresent(System.out::println);

		/*Third Example*/
		Stream.of("a1","a2","a3").mapToInt(s->{
			String p = s.substring(1);
			return Integer.parseInt(p);
		}).max().ifPresent(System.out::println);
		
		/*Fourth Example*/
		IntStream.range(1, 4).mapToObj(s->s+"a").forEach(System.out::println);
		
		/*Fifth Example*/
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(s->"Object@"+s).forEach(System.out::println);
	}

}
