package com.learn.threadlocalinheritance;

public class ParentThread extends Thread {
	
	static InheritableThreadLocal tl = new InheritableThreadLocal() {
		
		public Object childValue(Object p){
			return "CC";
		}
	};
	
	public void run(){
		tl.set("PP");
		System.out.println(tl.get());
		ChildThread cl = new ChildThread();
		cl.start();
	}

}
