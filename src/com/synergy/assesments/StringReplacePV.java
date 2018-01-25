package com.synergy.assesments;

public class StringReplacePV {

	public String replace(String s) {

		int spaceCount = 0, newLength = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		// Logic
		// newLength = currentLength + noOfspaces*3-noOfSpaces
		// newLength = currentLength + noOfSpaces(3-1)
		// newLength = currentLength + noOfSpaces*2
		newLength = s.length() + spaceCount * 2;

		char[] arr = new char[newLength];

		for (int i = s.length() - 1; i >= 0; i--) {

			char c = s.charAt(i);
			if (c == ' ') {
				arr[newLength - 1] = '0';
				arr[newLength - 2] = '2';
				arr[newLength - 3] = '%';

				newLength -= 3;
			} else {
				arr[newLength - 1] = c;
				newLength -= 1;
			}

		}

		return String.valueOf(arr);

	}
	
	public static void main(String[] args) {
		System.out.println(new StringReplacePV().replace("hello world Java"));
	}

}
