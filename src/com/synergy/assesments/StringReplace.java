package com.synergy.assesments;

public class StringReplace {

	public String replace(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				String s1 = s.substring(0, i) + "%20";
				String s2 = s.substring(i + 1, s.length());
				s = s1 + s2;
				// recursive call
				replace(s);
			}
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(new StringReplace().replace("hi hello how are you"));
	}

}
