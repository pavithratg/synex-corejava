package com.synex.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatNonRepeatV2 {

	public static void main(String[] args) {
		repeatNonRepeat("scissors");
	}

	public static void repeatNonRepeat(String input) {

		int countRepeat = 0;
		char firstRepeat = ' ';

		List<Character> firstNonRepeatList = new ArrayList<>();

		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = input.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			if (!map.containsKey(c)) {
				map.put(c, 1);
				firstNonRepeatList.add(c);
			} else {

				if (countRepeat == 0) {
					firstRepeat = c;
					countRepeat++;
				}

				if (firstNonRepeatList.contains(c)) {
					firstNonRepeatList.remove(new Character(c));
				}
				map.put(c, map.get(c) + 1);
			}

		}

		System.out.println("first repeat " + firstRepeat);
		System.out.println("first non repeat " + firstNonRepeatList.get(0));
	}

}
