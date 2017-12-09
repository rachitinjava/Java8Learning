package com.poc.defaultmethods;

interface A {
	
	default void mymethod(){
		System.out.println("this is my A's method");
	}
	
}

interface B {
	
	default void mymethod(){
		System.out.println("this is my B's method");
	}
	
}

public class DefaultMethodDemo4 implements A,B{

	public static void main(String[] args) {
		DefaultMethodDemo4 demo4 = new DefaultMethodDemo4();
		demo4.mymethod();
	}

	@Override
	public void mymethod() {
		A.super.mymethod();
	}

}
