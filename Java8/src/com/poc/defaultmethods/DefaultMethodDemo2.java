package com.poc.defaultmethods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rachit Shah
 * 
 * This call depicts usage of the default method forEach() of Iterable interface 
 *
 */
public class DefaultMethodDemo2 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Rachit", "Symentec");
		Employee employee2 = new Employee(2, "Shah", "Nothern Trust");
		Employee employee3 = new Employee(3, "Banerjee", "FIS");

		List<Employee> empList = new ArrayList<>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);

		empList.forEach(element -> {
			System.out.println("{");
			System.out.print(" Name :: "+element.getName());
			System.out.print(" Code :: "+element.getCode());
			System.out.println("}");
		});

	}
}