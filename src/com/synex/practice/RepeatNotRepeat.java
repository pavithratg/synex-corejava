package com.synex.practice;

import java.util.ArrayList;
import java.util.List;

public class RepeatNotRepeat {

	static List<Character> mainList = new ArrayList<>();
	static List<Character> nonRepeatList = new ArrayList<>();

	public static void main(String[] args) {
		repeatNotRepeat("jeehoo");
	}

	public static void repeatNotRepeat(String input) {

		char firstRepeated = ' ';

		int countRepeated = 0;

		char[] charArr = input.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			char c = charArr[i];
			
			if (!mainList.contains(c)) {
				mainList.add(c);
				nonRepeatList.add(c);

			} else {
				if (countRepeated == 0) {
					countRepeated++;
					firstRepeated = c;
				}

				Character ch = new Character(c);
				nonRepeatList.remove(ch);
			}
		}

		System.out.println(nonRepeatList);

		System.out.println("First Non Repeated " + nonRepeatList.get(0));
		System.out.println("First Repeated " + firstRepeated);

	}

}
