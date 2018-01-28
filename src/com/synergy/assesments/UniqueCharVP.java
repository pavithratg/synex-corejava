package com.synergy.assesments;

public class UniqueCharVP {

	public static void main(String[] args) {
		
		System.out.println(new UniqueCharVP().isUnique("abcdd"));

	}

	public boolean isUnique(String s) {
		boolean[] arr = new boolean[256];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i);
			if (arr[index])
				return false;
			arr[index] = true;
		}

		return true;
	}

}
