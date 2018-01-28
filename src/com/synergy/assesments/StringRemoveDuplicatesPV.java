package com.synergy.assesments;

public class StringRemoveDuplicatesPV {

	public static void main(String[] args) {

		new StringRemoveDuplicatesPV().removeDuplicates("apple");

	}

	public void removeDuplicates(String s) {
		boolean[] barr = new boolean[256];
		char[] arr = s.toCharArray();

		// tail keeps track of latest last character
		int tail = 0;
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i);
			if (!barr[index]) {
				arr[tail] = arr[i];
				if (tail != i) {
					arr[i] = '\u0000';
				}
				tail++;
				barr[index] = true;
			} else {
				arr[i] = '\u0000';
			}

		}
		
		printString(arr);

	}

	public void printString(char[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

}
