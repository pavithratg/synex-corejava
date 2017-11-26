package com.synex.practice;

public class SwapIntegers {

	public static void main(String[] args) {
		swap(10, 12);
	}

	public static void swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
