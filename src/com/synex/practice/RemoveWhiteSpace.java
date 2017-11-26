package com.synex.practice;

public class RemoveWhiteSpace {

	public static String removeWhiteSpace(String input) {

		String[] arr = input.split(" ");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("hi there how are you"));
	}

}
