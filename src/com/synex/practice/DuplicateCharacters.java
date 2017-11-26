package com.synex.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharacters {

	static HashMap<Character, Integer> map = new HashMap<>();

	public static void findDuplicates(String input) {

		char[] charArr = input.toCharArray();
		for (int i = 0; i < charArr.length; i++) {

			if (charArr[i] == ' ') {
				continue;
			}

			if (map.containsKey(charArr[i])) {
				map.put(charArr[i], map.get(charArr[i]) + 1);
			} else {
				map.put(charArr[i], 1);
			}
		}

		for (Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey());
			}
		}
	}

	public static void main(String[] args) {
		findDuplicates("hi how are you");
	}

}
