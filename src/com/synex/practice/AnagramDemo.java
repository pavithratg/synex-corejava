package com.synex.practice;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {

		System.out.println(isAnagram("keep", "peek"));

	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isAnagram(String s1, String s2) {

		boolean status = true;

		s1 = s1.replaceAll("\\s", "");

		s2 = s2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			status = false;
			return status;

		}

		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();

		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		s1 = String.valueOf(charArr1);
		s2 = String.valueOf(charArr2);

		if (s1.equals(s2)) {
			status = true;
		}

		return status;

	}

}
