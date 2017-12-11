package com.learn.threadlocal;

public class ThreadLocalDemo1A {

	public static void main(String[] args) {

		ThreadLocal tl = new ThreadLocal(){
			
			public Object initialValue(){
				
				return "INITIALVAL";
			}
			
		};
		System.out.println(tl.get());
		tl.set("NEWVAL");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
