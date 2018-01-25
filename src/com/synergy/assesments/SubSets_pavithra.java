package com.synergy.assesments;

public class SubSets_pavithra {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("[]");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("[" + arr[i] + "]");
			String previous = "" + arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				String current = "[" + previous + "," + arr[j] + "]";
				System.out.println(current);

				previous += "," + arr[j];

			}
		}
	}

}
