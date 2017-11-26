package com.synegy.model;

public class Mobile implements Comparable<Mobile> {

	private String vendor;
	private int price;
	private String color;

	public Mobile() {

	}

	public Mobile(String vendor, int price, String color) {
		super();
		this.vendor = vendor;
		this.price = price;
		this.color = color;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(Mobile o) {
		int i = this.getColor().compareTo(o.getColor());
		if (i == 0) {
			return this.getPrice() - o.getPrice();
		} else
			return i;
	}

	@Override
	public String toString() {
		return "Mobile [vendor=" + vendor + ", price=" + price + ", color=" + color + "]";
	}

}
