package com.learn.mapconcurrencies;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApp {

	public static void main(String[] args) {

		Map<String,String> map = new ConcurrentHashMap<String,String>();
		
		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Bangladesh", "Dhaka");
		map.put("SriLanka", "Colombo");
		map.put("China", "Beijing");
		map.put("China", "Beijing");
		
		Iterator<String> ittr = map.keySet().iterator();
		
		while(ittr.hasNext()){
			String countries = ittr.next();
			String capital = map.get(countries);
			map.put("abc", "xyz");
			System.out.println("Country "+countries+" capital "+capital);
		}
		
		
		
	}

}
