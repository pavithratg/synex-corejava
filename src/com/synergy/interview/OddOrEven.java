package com.synergy.interview;

public class OddOrEven {

	public static void main(String[] args) {
		oddOrEven(21);

	}

	public static void oddOrEven(int number) {
		if ((number & 1) == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

}
