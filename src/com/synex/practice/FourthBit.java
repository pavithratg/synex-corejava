package com.synex.practice;

public class FourthBit {

	public static int fourthBit(int num) {

		String str = Integer.toBinaryString(num);

		char[] charArr = str.toCharArray();

		char c = charArr[3];

		return c;

	}

	public static int fourthBit2(int num) {
		String bits = "";
		int remainder = 0;
		while (num > 1) {

			if (num % 2 == 0) {
				remainder = 0;
				bits += remainder;
				num = num / 2;
			} else {
				remainder = 1;
				bits += remainder;
				num = (num - 1) / 2;
			}

			if (num == 1) {
				bits += num;
			}

		}
		bits = new StringBuilder(bits).reverse().toString();
		char[] c = bits.toCharArray();
		return Character.getNumericValue(c[c.length - 4]);
	}

	public static void main(String[] args) {

		// System.out.println(fourthBit(32));
		System.out.println(fourthBit2(32));
	}

}
