package com.synergy.assesments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramV1 {

	public boolean isAnagram(String s1, String s2) {

		boolean flag = false;

		if (s1 == null || s2 == null) {
			return false;
		}

		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if (map1.get(c1) == null) {
				map1.put(c1, 1);
			} else {
				map1.put(c1, map1.get(c1) + 1);
			}

			if (map2.get(c2) == null) {
				map2.put(c2, 1);
			} else {
				map2.put(c2, map2.get(c2) + 1);
			}
		}

		for (Entry<Character, Integer> entry : map1.entrySet()) {
			char key = entry.getKey();
			int val = entry.getValue();

			if (map2.get(key) != null && map2.get(key) == val) {
				flag = true;
			} else {
				return false;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		boolean res = new AnagramV1().isAnagram("ABmCgg", "ABCD");

		System.out.println(res);
	}

}
