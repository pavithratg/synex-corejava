package com.synex.practice;

import java.util.HashMap;
import java.util.Map;

public class RepeatNonRepeatV3 {

	public static void repeatNonRepeat(String input) {

		char firstNonRepeated = ' ';
		char firstRepeated = ' ';
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = input.toCharArray();

		// constructing the HashMap, key is the character, value is the
		// occurrence of that character.
		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (!map.containsKey(c)) {
				map.put(c, 1);

			} else {
				map.put(c, map.get(c) + 1);
			}

		}

		// for finding first non repeated value.
		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (map.get(c) == 1) {
				firstNonRepeated = c;
				break;
			}
		}

		// for finding first repeated value
		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (map.get(c) > 1) {
				firstRepeated = c;
				break;
			}
		}

		System.out.println("first non repeated " + firstNonRepeated);
		System.out.println("first repeated " + firstRepeated);

	}

}
