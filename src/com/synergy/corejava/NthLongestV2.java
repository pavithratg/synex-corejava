package com.synergy.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NthLongestV2 {

	public static void main(String[] args) {
		String[] arr = { "abc", "abcd", "abce", "abcde" };

		nthLongestString(2, arr);

	}

	public static void nthLongestString(int n, String[] inputArr) {

		String res = "";

		Map<Integer, String> map = new HashMap<>();

		for (String string : inputArr) {

			int length = string.length();

			if (map.containsKey(length)) {
				map.put(length, map.get(length) + " " + string);
			} else {
				map.put(length, string);
			}

		}

		//System.out.println(map);

		int i = 0;

		for (Entry<Integer, String> m : map.entrySet()) {

			if (map.size() - i == n) {
				res = m.getValue();

				System.out.println(res);
			}

			i++;

		}
	}
}
