package com.poc.streams;

import java.util.stream.Stream;

public class ProcessingOrderStreamApp3 {

	public static void main(String[] args) {

		/* Example 1 */

		Stream.of("a", "b", "c").filter(s -> {
			System.out.println(s);
			return true;
		}).forEach(System.out::println);

		/* Example 2 */

		Stream.of("a", "b", "c").map(s -> {
			System.out.println("Mapping --> " + s);
			return s.toUpperCase();
		}).anyMatch(p -> {
			System.out.println("Matching --> " + p);
			return p.equals("B");
		});

		/* Example 3 */

		Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
			System.out.println("Mapping :: " + s);
			return s.toUpperCase();
		}).filter(p -> {
			System.out.println("Filtering :: " + p);
			return p.equals("A2");
		}).forEach(t -> System.out.println("ForEach :: " + t));

		/* Improvement */

		Stream.of("d2", "a2", "b1", "b3", "c").filter(p -> {
			System.out.println("Filtering :: " + p);
			return p.equals("a2");
		}).map(s -> {
			System.out.println("Mapping :: " + s);
			return s.toUpperCase();
		}).forEach(t -> System.out.println("ForEach :: " + t));

		/* Example 4 */

		Stream.of("d2", "a2", "b1", "b3", "c").sorted((s1, s2) -> {
			System.out.printf("Sorting :: %s %s \n", s1, s2);
			return s1.compareTo(s2);
		}).filter(p -> {
			System.out.println("Filtering :: " + p);
			return p.equals("a2");
		}).map(s -> {
			System.out.println("Mapping :: " + s);
			return s.toUpperCase();
		}).forEach(t -> System.out.println("ForEach :: " + t));

		/* Improvement */

		Stream.of("d2", "a2", "b1", "b3", "c").filter(p -> {
			System.out.println("Filtering :: " + p);
			return p.equals("a2");
		}).sorted((s1, s2) -> {
			System.out.printf("Sorting :: %s %s \n", s1, s2);
			return s1.compareTo(s2);
		}).map(s -> {
			System.out.println("Mapping :: " + s);
			return s.toUpperCase();
		}).forEach(t -> System.out.println("ForEach :: " + t));

	}

}
