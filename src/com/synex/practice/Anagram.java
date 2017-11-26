package com.synex.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		boolean status = true;

		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			status = false;
			return status;
		}

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {

			if (!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}

			if (map.containsKey(arr2[i])) {
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}

		}

		System.out.println(map);

		for (Integer value : map.values()) {

			if (value != 0) {
				status = false;
			}

		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("peek", "keep"));
	}

}
