package com.synex.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReduceTheFraction {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int max = scan.nextInt();
		String[] arr = new String[max];
		int count = 0;

		System.out.println(max);

		while (scan.hasNext()) {

			String val = scan.nextLine();
			System.out.println("Value " + val);
			System.out.println("max " + max);

			if (val.length() > 0) {

				arr[count] = val;

				System.out.println("count " + count + " " + arr[count]);

				count++;

				if (count == max) {
					break;
				}

			}

		}

		arr = reduceFraction(arr);

		for (String val : arr) {
			System.out.println(val);
		}
		
		scan.close();

	}

	public static String[] reduceFraction(String[] arr) {

		String[] strArr = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {

			String[] valArr = arr[i].split("/");
			int a = Integer.parseInt(valArr[0]);
			int b = Integer.parseInt(valArr[1]);

			System.out.println("a " + a);
			System.out.println("b " + b);

			if (a > b && a % b == 0) {
				strArr[i] = "1/" + b;
			} else if (b > a && b % a == 0) {
				strArr[i] = "1/" + a;
			} else {
				int hcf = highestCommonFactor(new int[] { a, b });
				System.out.println("hcf " + hcf);
				strArr[i] = a / hcf + "/" + b / hcf;
			}

		}

		return strArr;

	}

	public static int highestCommonFactor(int[] arr) {
		Set<Integer> set = new HashSet<>();

		int hcf = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = arr[i]; j >= 1; j--) {

				int remainder = arr[i] % j;

				if (remainder == 0) {

					// since we are finding the highest common factor, for the
					// first occurrence only we have to add values to the set.
					if (i == 0) {
						set.add(j);
					} else if (arr[i - 1] > arr[i]) {
						set.remove(arr[i - 1]);
					}
				} else {
					if (set.contains(j))
						set.remove(j);
				}

			}

		}

		for (Integer val : set) {

			if (val > hcf) {
				hcf = val;
			}

		}

		return hcf;

	}

}
