package com.synergy.corejava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Patrick");
		v.add("Sarvani");
		v.add("Hung");
		v.add("Scot");
		
		Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()){
			String s = e.nextElement();
			
			System.out.println(s);
			v.remove("Patrick");
		}
		
		
	}

}
