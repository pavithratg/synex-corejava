package com.synergy.assesments;

public class Pavithra_RemoveDuplicate {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(new Node(10));
		list.add(new Node(1));
		list.add(new Node(15));
		list.add(new Node(5));
		list.add(new Node(20));
		list.add(new Node(7));
		list.add(new Node(3));
		list.add(new Node(30));
		list.add(new Node(10));
		list.add(new Node(30));

		Util.removeDuplicates(list);
		Util.printList(list);

	}

}

class Node {
	private Node next;
	private Integer value;

	public Node(Integer value) {
		super();
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}

class LinkedList {

	private Node head;
	private Node tail;

	public boolean add(Node node) {

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}

		return true;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

}

class Util {
	public static void removeDuplicates(LinkedList list) {

		Node current = list.getHead();

		while (current != null) {
			Node innerCurrent = current;
			while (innerCurrent.getNext() != null) {
				if (current.getValue() == innerCurrent.getNext().getValue()) {
					innerCurrent.setNext(innerCurrent.getNext().getNext());
				} else {
					innerCurrent = innerCurrent.getNext();
				}
			}
			current = current.getNext();
		}

	}

	public static void printList(LinkedList list) {
		Node current = list.getHead();
		while (current != null) {
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
	}
}
