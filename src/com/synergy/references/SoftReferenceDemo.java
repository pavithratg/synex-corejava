package com.synergy.references;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {

	public static void main(String[] args) {

		// strong reference
		A a = new A();

		// soft reference
		SoftReference<A> softA = new SoftReference<A>(a);

		// removing the strong reference, now the object has only a soft
		// reference. Now the object is eligible for garbage collection but the
		// garbage collector will not remove the object from the memory until
		// JVM runs out of the memory.
		a = null;

		// you can retrieve a reference to the object by calling get() method of
		// SoftReference class if the object is still present in the memory, or
		// else it will return null.
		a = softA.get();

	}

}
