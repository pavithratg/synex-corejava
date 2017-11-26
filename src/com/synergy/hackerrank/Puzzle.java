package com.synergy.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Puzzle {

	private static Map<Integer, List<Integer>> holeMap = new HashMap<>();

	static {
		initializeHoleMap();
	}

	public static void main(String[] args) {
		System.out.println(holeMap.get(0));

		System.out.println(countHoles(1288));

	}

	public static int countHoles(int num) {
		int count = 0;
		char[] arr = String.valueOf(num).toCharArray();

		for (char c : arr) {

			for (Map.Entry<Integer, List<Integer>> entry : holeMap.entrySet()) {
				if (entry.getValue().contains(Character.getNumericValue(c))) {
					count += entry.getKey();
				}
			}

		}

		return count;
	}

	/**
	 * initialize the HashMap
	 */
	private static void initializeHoleMap() {
		List<Integer> zero = new ArrayList<>();
		zero.add(1);
		zero.add(2);
		zero.add(3);
		zero.add(5);
		zero.add(7);

		List<Integer> one = new ArrayList<>();
		one.add(0);
		one.add(4);
		one.add(6);
		one.add(9);

		List<Integer> two = new ArrayList<>();
		two.add(8);

		holeMap.put(0, zero);
		holeMap.put(1, one);
		holeMap.put(2, two);
	}

}
