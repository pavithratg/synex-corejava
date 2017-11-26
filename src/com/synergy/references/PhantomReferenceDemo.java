package com.synergy.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceDemo {

	public static void main(String[] args) {

		// strong reference
		A a = new A();

		// reference queue.
		ReferenceQueue<A> referenceQueue = new ReferenceQueue<>();

		// phantom reference
		PhantomReference<A> phantomA = new PhantomReference<A>(a, referenceQueue);

		// the strong reference is removed from the object, now the object is
		// left with only the phantom reference. Now the object is eligible for
		// garbage collection, but before it is being garbage collected, JVM
		// calling finalize() on it and put it in a reference queue.
		a = null;

		// we cannot get a reference to the object by calling get() method in
		// PhantomRefrence class, since it always return null.
		phantomA.get();

	}

}
