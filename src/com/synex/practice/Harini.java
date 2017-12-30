package com.synex.practice;

import java.util.HashSet;
import java.util.Set;

public class Harini {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		String s1 = "abc";
		String s2 = "abc";
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
	}

}
