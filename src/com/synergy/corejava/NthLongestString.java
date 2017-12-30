package com.synergy.corejava;

/**
 * 
 * return all the strings with the Nth longest length.
 *
 */
public class NthLongestString {

	public static void main(String[] args) {
		String[] arr = { "abc", "abcd", "abce", "abcde" };

		System.out.println(nthLongestString(4, arr));

	}

	public static String nthLongestString(int n, String[] inputArr) {
		String s = "";

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i].length() == n) {
				s += inputArr[i] + " ";
			}
		}

		return s;
	}

}
