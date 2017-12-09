package com.poc.methodexpression;

interface Convertor<F,T>{
	F convert(T t);
}

public class MethodExpressionDemo1 {

	public static void main(String[] args) {

		//Without Method Expression - Only Lambda Functions
		Convertor<Integer,String> convertor = input -> Integer.valueOf(input); 
		Integer integer = convertor.convert("1000");
		System.out.println("With Lambda :: "+integer);
		
		//With Method Expression - Static Method Function - Replacing Lambda Expression
		Convertor<Integer,String> converter1 = Integer::valueOf;
		Integer integer1 = converter1.convert("2000");
		System.out.println("With Static Method Expression"+integer1);
		
		//With Non-Static Method - Replacing Lambda Expression
		
		MethodExpressionDemo1 demo1 = new MethodExpressionDemo1();
		Convertor<Integer,String> converter2 = demo1::myConverter;
		Integer integer2 = converter2.convert("thousand");
		System.out.println("With Instance Method Expression"+integer2);
		
	}
	
	
	public Integer myConverter(String string){
		if(string.equals("thousand")){
			return 1000;
		}
		return 0;
	}

}
