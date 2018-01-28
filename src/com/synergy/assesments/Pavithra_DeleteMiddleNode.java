package com.synergy.assesments;

public class Pavithra_DeleteMiddleNode {

	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.add(new Node2(10));
		list.add(new Node2(1));
		list.add(new Node2(15));
		list.add(new Node2(5));
		list.add(new Node2(20));
		list.add(new Node2(7));
		list.add(new Node2(3));
		list.add(new Node2(30));
		list.add(new Node2(10));
		list.add(new Node2(30));
		list.add(new Node2(8));

		Util2.removeMiddleValue(list);
		Util2.printList(list);
	}

}

class Node2 {
	private Node2 next;
	private Integer value;

	public Node2(Integer value) {
		super();
		this.value = value;
	}

	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}

class LinkedList2 {

	private Node2 head;
	private Node2 tail;

	public boolean add(Node2 node) {

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}

		return true;
	}

	public Node2 getHead() {
		return head;
	}

	public void setHead(Node2 head) {
		this.head = head;
	}

	public Node2 getTail() {
		return tail;
	}

	public void setTail(Node2 tail) {
		this.tail = tail;
	}

}

class Util2 {
	public static void removeMiddleValue(LinkedList2 list) {

		int middle = getMiddlePosition(list);
		Node2 current = list.getHead();

		// iterating till finding the previous node to the middle node
		for (int i = 0; i < middle; i++) {
			if (i == middle - 1 && current.getNext() != null) {
				// updating the next reference of previous node to the middle
				// node
				current.setNext(current.getNext().getNext());
			}
			current = current.getNext();
		}

	}

	public static int getMiddlePosition(LinkedList2 list) {
		Node2 current = list.getHead();
		int size = 0;
		int middle = 0;
		while (current != null) {
			size++;
			current = current.getNext();
		}

		// calculating the index of middle value
		middle = (size - 1) / 2;

		return middle;

	}

	public static void printList(LinkedList2 list) {
		Node2 current = list.getHead();
		while (current != null) {
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
	}
}
