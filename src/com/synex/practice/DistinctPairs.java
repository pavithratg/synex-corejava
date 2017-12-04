package com.synex.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DistinctPairs {

	public static int numberOfPairs(int[] a, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], k - a[i]);
		}

		for (int i : map.values()) {
			if (map.containsKey(i)) {
				set.add(map.get(i));
			}
		}

		return set.size();

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		int[] a = new int[size];

		for (int i = 0; i < a.length; i++) {

			int input = scan.nextInt();

			a[i] = input;
			// System.out.println(a[i]);

		}

		int k = scan.nextInt();
		// System.out.println(k);

		/*
		 * int[] a = {1,3,46,1,3,9}; int k= 47;
		 */
		System.out.println(numberOfPairs(a, k));
	}

}
