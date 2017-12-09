package com.poc.methodexpression;


/**
 * @author Rachit Shah
 * This class is created too demostrate the Method Expression based on Constructor
 * TODO Future enhancement with Java Generics
 */
class Person {
	private Integer id;
	private String name;
	private String code;

	public Person(Integer id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
	
	
}

interface PersonFactory{
	Person getPerson(Integer id, String name, String code);
}
public class MethodExpressionDemo2 {
	
	public static void main(String[] args) {

		PersonFactory pf = Person::new;
		Person person = pf.getPerson(1, "Rachit", "R001");
		System.out.println(person);
	}

}
