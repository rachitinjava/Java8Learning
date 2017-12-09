package com.poc.defaultmethods;

import java.util.ArrayList;
import java.util.List;

class Employee {

	private Integer id;
	private String name;
	private String code;

	public Employee(Integer id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}

	public Employee() {
		super();
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
	

}



/**
 * @author Rachit Shah
 * 
 * This call depicts usage of the default method Sort() of List interface 
 *
 */
public class DefaultMethodDemo1 {

	public static void main(String[] args) {

		Employee employee1 = new Employee(1, "Rachit", "Symentec");
		Employee employee2 = new Employee(2, "Shah", "Nothern Trust");
		Employee employee3 = new Employee(3, "Banerjee", "FIS");

		List<Employee> empList = new ArrayList<>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);

		empList.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));

		System.out.println(empList.toString());
	}
}