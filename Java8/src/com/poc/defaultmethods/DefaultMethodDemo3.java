package com.poc.defaultmethods;

interface Vehicle{
	
	default void getDetail(){
		System.out.println("I am speaking from Vehicle");
	}
}

class Car implements Vehicle{
	public void getDetail(){
		System.out.println("I am speaking from Car");
	}
}

public class DefaultMethodDemo3 {

	public static void main(String[] args) {

		Car car = new Car();
		car.getDetail();
	}

}
