package com.poc.functionalinterface;

public class MathOperationTest {

	public static void main(String[] args) {

		MathOperations mo1 = (a,b) -> a+b;
		MathOperations mo2 = (a,b) -> a-b;
		MathOperations mo3 = (a,b) -> a*b;
		MathOperations mo4 = (a,b) -> a/b;
		
		int a = 20;
		int b = 10;
		calculate(a,b,mo1);
		
	}

	private static void calculate(int a, int b, MathOperations mo) {
		System.out.println(mo.mathOperation(a, b));
	}

}
