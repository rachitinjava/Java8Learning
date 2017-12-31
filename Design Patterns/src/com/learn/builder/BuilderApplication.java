package com.learn.builder;

public class BuilderApplication {

	public static void main(String[] args) {

		OAuthToken token = new OAuthToken.Builder().clientId("123").password("rachit").username("Shri maan").type("secret").build();
		
		System.out.println(token);
		
	}

}
