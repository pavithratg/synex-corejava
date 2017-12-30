package com.synergy.interview;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println(isNumberPalindrome(434));
	}

	public static boolean isNumberPalindrome(int num) {

		boolean status = false;

		String input = Integer.toString(num);

		char[] charArr = input.toCharArray();

		String reversed = "";

		for (int i = charArr.length - 1; i >= 0; i--) {

			reversed += charArr[i];

		}

		if (input.equals(reversed)) {

			status = true;
		}

		return status;
	}

}
