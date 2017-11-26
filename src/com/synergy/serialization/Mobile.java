package com.synergy.serialization;

import java.io.Serializable;

public class Mobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6876664960907513499L;
	private static String vendor = "Apple";
	private transient int price;
	private String color;

	public Mobile() {

	}

	public Mobile(String vendor, int price, String color) {
		super();
		// this.vendor = vendor;
		this.price = price;
		this.color = color;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String v) {
		vendor = v;
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

	public void setName(String color) {
		this.color = color;
	}

}
