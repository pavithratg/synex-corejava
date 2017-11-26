package com.synex.practice;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		swap("hi", "bye");
	}

	public static void swap(String s1, String s2) {

		int lengths1 = s1.length();
		int lengths2 = s2.length();

		// hibye
		s1 = s1 + s2;

		s2 = s1.substring(0, lengths1);
		s1 = s1.substring(lengths1, lengths1 + lengths2);

		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);

	}

}
