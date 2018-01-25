package com.synergy.assesments;

public class MaxSubArray {

	private static int[] arr = { 4, 3, -5, 0, 6, -8, 0 };
	
	//private static int[] arr = { 0, 3, -5, 4, 6, -8, 0 };

	public static void main(String[] args) {

		// final start index
		int startIndex = 0;
		// final end index
		int endIndex = 0;
		// final max value
		int gMax = 0;

		for (int i = 0; i < arr.length; i++) {

			// for each sequence start index
			int sIndex = 0;
			// for each sequence end index
			int eIndex = 0;
			// for each sequence count value
			int count = 0;
			// for each sequence max value
			int max = 0;

			for (int j = i; j < arr.length; j++) {
				if (j == i) {
					sIndex = j;
					eIndex = j;
					count = arr[j];
					max = count;
				} else {
					count += arr[j];

					// for the particular sequence id the count value exceeds
					// the max value then max value is updated with the count
					// value. Also the end index also updated with the current
					// index for the sequence.
					if (count > max) {
						max = count;
						eIndex = j;
					}
				}
			}
			// after each sequence, if the max value for the sequence exceeds
			// the final max value, then the final max value should be updated.
			// Also the final start index, and the final end index should be
			// updated
			if (max > gMax) {
				startIndex = sIndex;
				endIndex = eIndex;
				gMax = max;
			}
		}

		System.out.println("Maximum sum: " + gMax + " Indexes (" + startIndex + "," + endIndex + ")");
	}

}
