package com.synergy.assesments;

import java.util.HashMap;
import java.util.Map;

public class StringUniqueCharacters {

	public static void main(String[] args) {
		
		String s = "abcde";
		boolean status = new StringUniqueCharacters().hasUniqueCharacters(s);
		System.out.println(status);
	}

	public boolean hasUniqueCharacters(String s) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				return false;
			}
		}
		
		return true;
	}

}
