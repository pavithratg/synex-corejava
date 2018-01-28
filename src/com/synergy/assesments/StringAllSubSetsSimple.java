package com.synergy.assesments;

public class StringAllSubSetsSimple {

	public static void main(String[] args) {
		subSets("abcde");

	}

	public static void subSets(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				System.out.println(str.substring(i, j));
	}

}
