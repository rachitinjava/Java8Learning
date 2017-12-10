package com.poc.functions;

import java.util.function.Function;

public class FunctionApplication {

	public static void main(String[] args) {

		Function<String,Integer> function1 = Integer::valueOf;
		Function<String,String> function2 = function1.andThen(String::valueOf);
		
		Object s  = function2.apply("1000");
		
		System.out.println(s instanceof String);
		
	}

}
