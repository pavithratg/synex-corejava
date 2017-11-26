package com.synegy.sort;

import java.util.Set;
import java.util.TreeSet;

import com.synegy.model.Mobile;

public class MobileSortMain {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("apple", 600, "silver");
		Mobile m2 = new Mobile("samsung", 400, "black");
		Mobile m3 = new Mobile("nexus", 350, "white");
		Mobile m4 = new Mobile("nokia", 200, "black");
		Mobile m5 = new Mobile("motorolla", 300, "silver");

		// will sort according to natural sorting order
		Set<Mobile> mobiles = new TreeSet<>();

		// will sort according to a custom sorting order specified in
		// comparator.
		Set<Mobile> mobiles2 = new TreeSet<>(new MobileComparator());

		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);

		System.out.println(mobiles);

		mobiles2.add(m1);
		mobiles2.add(m2);
		mobiles2.add(m3);
		mobiles2.add(m4);
		mobiles2.add(m5);

		System.out.println(mobiles2);

	}

}
