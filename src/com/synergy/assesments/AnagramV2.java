package com.synergy.assesments;

public class AnagramV2 {

	public boolean isAnagram(String s1, String s2) {

		if (s1 == null || s2 == null) {
			return false;
		}
		if (s1.length() != s2.length()) {
			return false;
		}

		boolean flag = false;

		int[] arr1 = new int[256];
		int[] arr2 = new int[256];

		for (int i = 0; i < s1.length(); i++) {
			int in1 = s1.charAt(i);

			arr1[in1] += 1;
			//System.out.println("in1 " + in1 + " val " + arr1[in1]);

			int in2 = s2.charAt(i);

			arr2[in2] += 1;
			//System.out.println("in2 " + in2 + " val " + arr2[in2]);
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				flag = true;
			} else {
				return false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(new AnagramV2().isAnagram("AnCD", "ACBD"));
	}

}
