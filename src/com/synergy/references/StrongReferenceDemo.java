package com.synergy.references;

/**
 * Any object in memory which has an active strong reference is not eligible for
 * garbage collection.
 */
public class StrongReferenceDemo {

	public static void main(String[] args) {
		// a is a strong reference.
		A a = new A();
		// now the reference a is pointing to null, the object it previously
		// referenced is eligible for garbage collection. 
		a = null;
	}

}
