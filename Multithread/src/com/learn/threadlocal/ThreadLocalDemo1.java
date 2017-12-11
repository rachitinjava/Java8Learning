package com.learn.threadlocal;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {

		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());
		tl.set("NEWVAL");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}

}
