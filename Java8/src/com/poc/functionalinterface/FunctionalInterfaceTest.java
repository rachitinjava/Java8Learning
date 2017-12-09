package com.poc.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		Predicate<Integer> predicate1 = new Predicate<Integer>(){
			@Override
			public boolean test(Integer arg0) {
				return arg0>2;
			}
		};
		
		
		Predicate<Integer> predicate2 = n -> n%2 == 0;
	List<Integer> integerList = Arrays.asList(1,2,3);
	
/*	eval(integerList,predicate1);*/
	eval(integerList,predicate2);
		
	}

	private static void eval(List<Integer> integerList, Predicate<Integer> predicate1) {
		/*Consumer<? super Integer> consumer1 = value -> {
			if(predicate1.test(value)){
				System.out.println("value :: "+ value + " is greater than 2");
			}
			
		};*/
		Consumer<? super Integer> consumer2 = value -> {
			if(predicate1.test(value)){
				System.out.println("value :: "+ value + " is even");
			}
			
		};
		//integerList.forEach(consumer1);
		integerList.forEach(consumer2);
	}

}
