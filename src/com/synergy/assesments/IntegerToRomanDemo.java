package com.synergy.assesments;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * assumption : input range 1-10
 *
 */
public class IntegerToRomanDemo {

	static Map<Integer, String> symbolTable = new HashMap<>();

	public static void main(String[] args) {

		symbolTable.put(1, "I");
		symbolTable.put(4, "IV");
		symbolTable.put(5, "V");
		symbolTable.put(9, "IX");
		symbolTable.put(10, "X");

		int input = 8;

		int remainder = 0;

		if (input >= 1 && input < 5) {

			if (input == 4) {
				System.out.println(symbolTable.get(4));
			}

			remainder = printRoman(input, 1);

		} else if (input >= 5 && input <= 10) {

			if (input == 9) {
				System.out.println(symbolTable.get(9));
			} else if (input == 10) {
				System.out.println(symbolTable.get(10));
			}

			remainder = printRoman(input, 5);

			if (remainder >= 1) {
				printRoman(remainder, 1);
			}

		}

	}

	private static int printRoman(int in, int base) {

		int quotiet = in / base;
		int remainder = in % base;

		for (int i = 0; i < quotiet; i++) {
			System.out.print(symbolTable.get(base));
		}

		return remainder;

	}
}
