package com.poc.lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {

		List<String> friendList = Arrays.asList("Rachit","Kumar","Shah");
		
/*		friendList.forEach(new Consumer<String>(){

			@Override
			public void accept(String friend) {
				System.out.println(friend);
			}
			
		});*/
		
		
		friendList.forEach(friend -> System.out.println(friend));
		
		
	}

}
