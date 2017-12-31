package com.poc.corejava;

import java.util.HashSet;

public class ClassLoaderExample {

	public static void main(String[] args) {

		System.out.println(HashSet.class.getClassLoader());
		
		System.out.println(Employee.class.getClassLoader());
		
		System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
		
		System.out.println(sun.net.spi.nameservice.dns.DNSNameServiceDescriptor.class.getClassLoader());
		
		
	}

}
