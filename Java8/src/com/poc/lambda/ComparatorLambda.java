package com.poc.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer{
	
	private Integer id;
	private String name;

	public Customer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
}


public class ComparatorLambda {
	
	public static void main(String[] args) {
		
	Customer c1 = new Customer(4, "Rachit");
	Customer c2 = new Customer(2, "Shah");
	Customer c3 = new Customer(3, "Kumar");
	
	List<Customer> list  = new ArrayList<>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	
	/*Old School Method
	 * Collections.sort(list, new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o1.getId().compareTo(o2.getId());
		}
		
	});
*/	
	Collections.sort(list, (o1,o2) -> o1.getId().compareTo(o2.getId()));
	
	System.out.println(list.toString());
	
	}

}
