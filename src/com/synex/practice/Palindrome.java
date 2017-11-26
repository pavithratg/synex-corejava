package com.synex.practice;

public class Palindrome {

	public static void main(String[] args) {

		// String test = "madam";
		String test = "test";
		String result = "";

		// converting the String to character array.
		char[] cArr = test.toCharArray();

		// reversing the string.
		for (int i = cArr.length - 1; i >= 0; i--) {
			result += cArr[i];
		}

		// if reversed string is equal to input string it is a palindrome.
		if (test.equals(result)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

}
