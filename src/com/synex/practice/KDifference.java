package com.synex.practice;

import java.util.HashMap;
import java.util.Map;

public class KDifference {

	public static int kDifference(int[] arr, int k) {

		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int val = arr[i];
			map.put(val, val + k);
		}

		for (int i : map.keySet()) {
			if (map.containsKey(map.get(i))) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int result = kDifference(new int[] { 2, 4, 6, 8, 10, 12 }, 2);

		System.out.println(result);
	}

}
