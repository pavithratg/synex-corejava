package com.synergy.corejava;

/**
 * A Pangram is a sentence which contains all the letters in English alphabet at
 * least once.
 *
 */
public class Pangram {

	public static void main(String[] args) {

		System.out.println(isPanagram("The uick brown fox jumps over the lazy dog"));

	}

	public static boolean isPanagram(String s) {

		if (s == null || s.length() < 26) {
			return false;
		}

		String upper = s.toUpperCase();

		for (char c = 'A'; c <= 'Z'; c++) {

			if (upper.indexOf(c) < 0)
				return false;

		}

		return true;

	}

}
