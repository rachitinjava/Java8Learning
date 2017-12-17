package com.poc.streams.advanceconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectApp1 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		
		/*Example 1*/
		List<Person> filterList = persons.stream().filter(s -> s.getName().startsWith("P")).collect(Collectors.toList());
		System.out.println(filterList);
		
		/*Example 2*/
		
	}
}
