package com.synex.practice;

public class PassByValueSwapDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;

		swap(a, b);
		System.out.println("a= " + a + " b= " + b);

	}

	public static void swap(int x, int y) {

		int tmp = x;
		x = y;
		y = tmp;

	}

}
