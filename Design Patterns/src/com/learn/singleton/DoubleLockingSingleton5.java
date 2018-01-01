package com.learn.singleton;

/**
 * 
 * To improve the performance over synchronized() we are using doubly checked singleton 
 * However, prior to java5 JMM had lots of issues regarding this approach for large number of threads.
 * Hence, bill pugh has provided static inner class approach.
 */
public class DoubleLockingSingleton5 {

	private static volatile DoubleLockingSingleton5 instance;

	private DoubleLockingSingleton5() {
	}

	public static DoubleLockingSingleton5 getInstance() {

		if (instance == null) {
			synchronized (DoubleLockingSingleton5.class) {
				if (instance == null) {
					instance = new DoubleLockingSingleton5();
				}
			}
		}
		return instance;
	}

}
