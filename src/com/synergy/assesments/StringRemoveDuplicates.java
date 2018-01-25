package com.synergy.assesments;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		String s = new StringRemoveDuplicates().removeDuplicates("abbcdd");
		System.out.println(s);
	}

	public String removeDuplicates(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ci = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				char cj = s.charAt(j);
				if (ci == cj) {
					String s1 = s.substring(0, j);
					String s2 = s.substring(j + 1, s.length());
					s = s1 + s2;
					removeDuplicates(s);
				}
			}
		}

		return s;
	}

}
