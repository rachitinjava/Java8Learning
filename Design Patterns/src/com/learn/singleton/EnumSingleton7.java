package com.learn.singleton;

/*
 * The only drawback is it does not support the lazy initialization
 * But protects from reflection.
 * it is thread safe
 * it takes care of serialization
 * 
 * otherwise we would have to implement the method
 * 
 * 
 * //readResolve to prevent another instance of Singleton
    private Object readResolve(){
        return INSTANCE;
    }

	Read more: http://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html#ixzz52qHs4on6
 */
public enum EnumSingleton7 {

	INSTANCE;
	
	public static void doSomething(){
		
		
	}
	
}
