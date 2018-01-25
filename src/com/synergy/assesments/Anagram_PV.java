package com.synergy.assesments;

public class Anagram_PV {

	public boolean isAnagram(String s1, String s2) {

		int[] letters = new int[256];
		int uniqueCount = 0;
		int completeCount = 0;

		for (char c : s1.toCharArray()) {
			// checking if we are adding the character for the first time
			if (letters[c] == 0) {
				uniqueCount++;
			}
			// incrementing the character count
			letters[c]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);

			// if a character in s2 is not present within the array, no need to
			// proceed ahead.
			if (letters[c] == 0) {
				return false;
			}

			// decrementing the character count
			letters[c]--;
			// checking again to see if have consumed all of such characters
			if (letters[c] == 0) {
				completeCount++;

				if (completeCount == uniqueCount) {

					// check if s2 has been processed completely
					if (i == s2.length() - 1) {
						return true;
					}
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(new Anagram_PV().isAnagram("APPLE", "PPEAL"));
	}

}
