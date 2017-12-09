package com.poc.functionalinterface;

public class GreetingService {

	public static void main(String[] args) {

		Greetable grt = message -> System.out.println("hello ::"+ message);
		
		sayGreetings("Rachit",grt);
	}

	private static void sayGreetings(String string, Greetable grt) {
		grt.greetMe(string);

	}

}
