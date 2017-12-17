package com.poc.streams.advanceconcept;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByApp2 {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		Map<Integer, List<Person>> personMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		personMap.forEach((age, person) -> System.out.printf("Age:: %s : Person :: %s \n", age, person));

		// How to calculate the average of ages?

		Double averageAge = persons.stream().collect(Collectors.averagingInt(Person::getAge));
		System.out.println(averageAge);

		// How to find out summarizing statitics?

		IntSummaryStatistics summerizingInt = persons.stream().collect(Collectors.summarizingInt(Person::getAge));
		System.out.println(summerizingInt);

		// How to join all persons?

		String phrase = persons.stream().filter(p -> {
			if (p.getAge() >= 18) {
				return true;
			}
			return false;
		}).map(p -> p.getName())
				.collect(Collectors.joining(" and ", "I am the prefix for Persons ", ".However, I am the suffix"));

		System.out.println(phrase);

		// How to merge person with additional parameter to bypass the
		// exception?

		Map<Integer, String> map = persons.stream()
				.collect(Collectors.toMap(Person::getAge, Person::getName, (name1, name2) -> name1 + ";" + name2));
		System.out.println(map);

		/*
		 * We want to transform all persons of the stream into a single string
		 * consisting of all names in upper letters separated by the | pipe
		 * character. In order to achieve this we create a new collector via
		 * Collector.of(). We have to pass the four ingredients of a collector:
		 * a supplier, an accumulator, a combiner and a finisher.
		 * 
		 * We want to transform all persons of the stream into a single string
		 * consisting of all names in upper letters separated by the | pipe
		 * character. In order to achieve this we create a new collector via
		 * Collector.of(). We have to pass the four ingredients of a collector:
		 * a supplier, an accumulator, a combiner and a finisher.
		 */

		// Collector.of(supplier, accumulator, combiner,
		// finisher/characteristics);
		Collector<Person, StringJoiner, String> customCollector = Collector.of(() -> new StringJoiner("|"),
				(j, p) -> j.add(p.getName().toString()), (j1, j2) -> j1.merge(j2), StringJoiner::toString);
		String perstream = persons.stream().collect(customCollector);
		System.out.println(perstream);

	}

}
