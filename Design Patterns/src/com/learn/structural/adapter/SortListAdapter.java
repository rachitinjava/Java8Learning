package com.learn.structural.adapter;

import java.util.ArrayList;
import java.util.List;

class SortListAdapter implements Sorter {

	@Override
	public int[] sort(int[] numbers) {

		// convert the array to a List

		List<Integer> numberList = new ArrayList<Integer>();
		for (int i : numbers) {
			numberList.add(i);
		}
		// call the adapter
		NumberSorter sorter = new NumberSorter();
		numberList = sorter.sort(numberList);
		// convert the list back to an array and return

		return numberList.stream().mapToInt(i -> i).toArray();
	}
}
