package com.poc.corejava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeAndEqualsDemo {
	
	public static void main(String[] args) {

/*		Set<Employee> employees = new HashSet<>();
		
		employees.add(new Employee(1,"Rachit"));
		employees.add(new Employee(1,"Rachit"));
		employees.add(new Employee(1,"Rachit"));
		employees.add(new Employee(1,"Rachit"));
		
		System.out.println(employees);
*/
		Map<Employee,Integer> maps = new HashMap<>();
		
		maps.put(new Employee(1,"Rachit"),221);
		maps.put(new Employee(1,"Rachit"),222);
		maps.put(new Employee(1,"Rachit"),223);
		
		System.out.println(maps.size());
		System.out.println(maps);
	}

}
