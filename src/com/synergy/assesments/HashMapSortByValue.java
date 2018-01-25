package com.synergy.assesments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * http://www.javainterviewpoint.com/how-to-sort-hashmap-in-java-by-keys/
 *
 */
public class HashMapSortByValue {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 3);
		map.put(3, 20);
		map.put(4, 2);
		map.put(5, 8);

		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

		for (Entry<Integer, Integer> entry : list) {
			
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(sortedMap);

	}

}
