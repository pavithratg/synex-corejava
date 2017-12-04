package com.synergy.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrisonersSweets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String testCases = scan.nextLine();
		
		int noOfTestCases = Integer.parseInt(testCases);

		for (int i = 0; i < noOfTestCases; i++) {

			String str = scan.nextLine();

			String[] inputs = str.split(" ");

			int n = Integer.parseInt(inputs[0]);
			int m = Integer.parseInt(inputs[1]);
			int s = Integer.parseInt(inputs[2]);
			//System.out.println(n + " " + m + " " + s);
			
			System.out.println(prisonerWithPoisonSweet(n, m, s));

		}

		

	}

	public static int prisonerWithPoisonSweet(int n, int m, int s) {

		Map<Integer, Integer> map = new HashMap<>();

		int poisonedId = 0;

		for (int i = 1; i <= m; i++) {

			map.put(s, i);

			if (s <= n) {
				s++;
			} else {
				s = 1;
			}

		}

		// System.out.println(map);

		for (Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == m) {
				poisonedId = entry.getKey();
			}

		}

		// System.out.println(poisonedId);

		return poisonedId;

	}

}
