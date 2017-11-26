package com.synergy.corejava;

/**
 * 
 * Even if we destroy the bigger object, the dependencies have an existence,
 * they are not destroyed.
 *
 */
public class AggregationDemo {

	public static void main(String[] args) {

		// Money has an existence without wallet
		Money money = new Money(100);

		// wallet doesn't have an existence without money
		Wallet wallet = new Wallet("brown", "abc", money);
	}
}

class Wallet {
	private String color;
	private String brand;

	public Wallet(String color, String brand, Money money) {
		super();
		this.color = color;
		this.brand = brand;
		this.money = money;
	}

	// has-a / unidirectional
	private Money money;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}

}

class Money {

	private int value;

	public Money(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}