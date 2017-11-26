package com.synex.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 3, 4, 3, 9 };

		System.out.println(countDuplicate(arr));
	}

	public static int countDuplicate(int[] arr) {

		Map<Integer, Integer> valueMap = new HashMap<>();
		Set<Integer> duplicateSet = new HashSet<>();

		for (int i : arr) {

			if (valueMap.containsValue(i)) {
				duplicateSet.add(i);
			} else {
				valueMap.put(i, i);
			}

		}
		return duplicateSet.size();

	}

}
