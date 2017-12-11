package com.learn.concurrent.reenterentlocks;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterentLocks {

	public static void main(String[] args) {
		
	ReentrantLock l = new ReentrantLock(true);
	
	l.lock();
	l.lock();
	
	System.out.println(l.isLocked());
	System.out.println(l.isHeldByCurrentThread());
	System.out.println(l.getQueueLength());
	System.out.println(l.getHoldCount());
	
	l.unlock();
	
	System.out.println(l.getHoldCount());
	System.out.println(l.isLocked());
	
	l.unlock();
	
	System.out.println(l.isLocked());
	System.out.println(l.isFair());
	
	
	
	
	
	
		
	}
	
	}
