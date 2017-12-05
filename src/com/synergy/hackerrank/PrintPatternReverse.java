package com.synergy.hackerrank;

public class PrintPatternReverse {

	public static void main(String[] args) {

		String s = "1 2 3 4 5 6 7 8 9 10";

		String[] strArr = s.split(" ");

		System.out.println(s);
		for (int i = strArr.length - 1; i > 0; i--) {
			s = s.replaceFirst(" " + (i + 1), "");
			System.out.println(s);

		}

	}

}

// for (int i = 10; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print(j+ " ");
// }
// System.out.println();
// }
