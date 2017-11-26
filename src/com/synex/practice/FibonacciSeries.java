package com.synex.practice;

/**
 * 
 * https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 *
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		// in a fibonacci series always the first two numbers are 0,1
		String result = "0,1";
		int a = 0;
		int b = 1;
		for (int i = 0; i <= 50; i++) {

			// The next number is found by adding up the two numbers before it.
			int c = sum(a, b);
			result = result + "," + c;
			a = b;
			b = c;
		}

		System.out.println(result);
	}

	// returns the sum
	public static int sum(int x, int y) {
		return x + y;
	}

}
