package com.synergy.references;

import java.lang.ref.WeakReference;

public class WeakReferenceDemo {

	public static void main(String[] args) {

		// strong reference
		A a = new A();

		// weak reference
		WeakReference<A> weakA = new WeakReference<A>(a);

		// removing the strong reference, now the object is left only with weak
		// reference. Now the object is eligible for garbage collection, when
		// the JVM runs the garbage collector, this object is likely to be
		// garbage collected.
		a = null;

		// we can retrieve a reference to the object by calling get() method in
		// WeakReference class, if the object is still in the memory, or else it
		// will return null.
		a = weakA.get();

	}

}
