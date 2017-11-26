package com.synegy.sort;

import java.util.Comparator;

import com.synegy.model.Mobile;

public class MobileComparator implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getPrice() - o2.getPrice();
	}

}
