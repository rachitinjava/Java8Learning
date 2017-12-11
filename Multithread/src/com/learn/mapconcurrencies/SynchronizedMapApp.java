package com.learn.mapconcurrencies;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedMapApp {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		Collections.synchronizedMap(map);
		
		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Bangladesh", "Dhaka");
		map.put("SriLanka", "Colombo");
		map.put("China", "Beijing");
		
		Iterator<String> ittr = map.keySet().iterator();
		
		while(ittr.hasNext()){
			String countries = ittr.next();
			String capital = map.get(countries);
		//	map.put("abc", "xyz");
			System.out.println("Country"+countries+"capital"+capital);
		}
	}
}
