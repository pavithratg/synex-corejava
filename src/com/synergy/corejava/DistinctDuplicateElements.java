package com.synergy.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * Find all the distinct duplicate elements.
 *
 */
public class DistinctDuplicateElements {

	public static void main(String[] args) {

		System.out.println(distinctDuplicates("1122345"));

	}

	public static String distinctDuplicates(String input) {

		String res = "";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}

		}

		for (Entry<Character, Integer> m : map.entrySet()) {

			if (m.getValue() > 1) {
				res += m.getKey() + " ";
			}

		}

		return res;

	}

}
