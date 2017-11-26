package com.synex.practice;

import java.util.ArrayList;

public class Stack extends ArrayList<Integer> {

	public void push(int k) {
		this.add(k);
		System.out.println(this.get(this.size() - 1));
	}

	public void pop() {

		if (!this.isEmpty()) {

			if (this.size() == 1) {
				this.remove(this.size() - 1);
				System.out.println("EMPTY");
			} else {
				this.remove(this.size() - 1);
				System.out.println(this.get(this.size() - 1));
			}

		} else {
			System.out.println("EMPTY");
		}
	}

	public void inc(int e, int k) {
		if (this.isEmpty()) {
			System.out.println("EMPTY");
		} else if (!this.isEmpty() && this.size() >= e) {
			int last = this.size() - 1;
			for (int i = 0; i < e; i++) {
				this.set(i, this.get(i) + k);
			}
			System.out.println(this.get(last));
		} else {
			System.out.println(this.get(this.size() - 1));
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		String[] operations = { "push 4", "pop", "push 3", "push 5", "push 2", "inc 3 1", "pop", "push 1", "inc 2 2",
				"push 4", "pop", "pop" };

		for (String operation : operations) {

			if (operation.startsWith("push")) {
				String[] opArr = operation.split(" ");
				stack.push(Integer.parseInt(opArr[1]));
			} else if (operation.startsWith("pop")) {
				stack.pop();
			} else if (operation.startsWith("inc")) {
				String[] opArr = operation.split(" ");
				stack.inc(Integer.parseInt(opArr[1]), Integer.parseInt(opArr[2]));
			} else {
				System.out.println("Undefined Operation!");
			}

		}
	}

}
