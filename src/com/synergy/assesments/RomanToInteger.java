package com.synergy.assesments;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * Assumption: value range 1-10
 *
 */
public class RomanToInteger {

	static Map<String, Integer> sysmbolMap = new HashMap<>();

	public static void main(String[] args) {

		String input = "VIII";

		sysmbolMap.put("I", 1);
		sysmbolMap.put("IV", 4);
		sysmbolMap.put("V", 5);
		sysmbolMap.put("IX", 9);
		sysmbolMap.put("X", 10);

		if (input.equals("X")) {
			System.out.println(sysmbolMap.get("X"));
		} else if (input.equals("IV")) {
			System.out.println(sysmbolMap.get("IV"));
		} else {
			String[] arr = input.split("");

			int count = 0;

			for (String string : arr) {
				count += sysmbolMap.get(string);
			}
			
			System.out.println(count);
		}

	}

}
