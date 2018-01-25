package com.synergy.assesments;

public class MaxPossibleSubArraysV2 {

	static int[] arr1 = { 1, 4, 6, 7, 9 };

	public void subArray(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if ((arr1[i] + arr1[j]) % 3 == 0) {
					System.out.println("{" + arr1[i] + "," + arr1[j] + "}");
				}

				int[] in = { arr1[i], arr1[j] };
				subArrayPermute(arr1, in);
			}
		}

	}

	public void subArrayPermute(int[] arr1, int[] arr2) {
		for(int i=0;i<arr1.length;i++){
			//for(int j=)
		}
		
	}

	public static void main(String[] args) {
		new MaxPossibleSubArraysV2().subArray(arr1);
	}

}
