package com.synergy.assesments;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr = { 6, 10, 4, 7, 11, 3, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
