package com.synex.practice;

import java.util.HashSet;

public class RemoveHashSet {
	
	public static void main(String[] args) {
		HashSet<Short> set = new HashSet<>();
		for (short i = 0; i < 100; i++) {
			set.add(i);
			set.remove(i-1);
		}
		
		System.out.println(set.size());
	}

}
