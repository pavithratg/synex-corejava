package com.synergy.concurrent;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {

	static CopyOnWriteArrayList<Integer> cowArray = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {

		cowArray.add(1);
		cowArray.add(2);
		cowArray.add(3);
		cowArray.add(4);
		cowArray.add(5);

		/*
		 * The essential thing to remember with a copy-on-write collection is
		 * that a thread that is looping through the elements in a collection
		 * must keep a reference to the same unchanging elements throughout the
		 * duration of the loop; this is achieved with the use of an Iterator.
		 * Basically, you want to keep using the old, unchanging collection that
		 * you began a loop with. When you use list.iterator(), the returned
		 * Iterator will always reference the collection of elements as it was
		 * when list.iterator() was called, even if another thread modifies the
		 * collection. Any mutating methods called on a copy-on-write–based
		 * Iterator or ListIterator (such as add, set, or remove) will throw an
		 * UnsupportedOperationException.
		 */
		Iterator<Integer> itr = cowArray.iterator();
		while (itr.hasNext()) {

			// this will not affect on iterator. Here a copy of the collection
			// will be created, the internal collection is left untouched.
			cowArray.add(7);
			if (itr.next() == 1) {

				// will throw java.lang.UnsupportedOperationException if we try
				// to modify underlying unmodifiable collection. Because the
				// iterator works on a read-only collection.
				itr.remove();
			}

		}

	}

}
