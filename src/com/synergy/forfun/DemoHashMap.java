package com.synergy.forfun;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DemoHashMap<K, V> {

	// initial capacity of the array containing buckets is 16
	@SuppressWarnings("unchecked")
	LinkedList<Node<K, V>>[] bucketArray = (LinkedList<Node<K, V>>[]) new LinkedList[16];

	Map<String, Integer> map = new HashMap<>();

	/**
	 * static int indexFor(int h, int length) { return h & (length-1); }
	 * Bitwise AND returns the same value as h mod length, but much faster
	 * 
	 * TODO: Rehashing
	 **/
	public V put(K key, V value) {
		boolean flag = false;
		int index = key.hashCode() & (bucketArray.length - 1);
		Node<K, V> node = new Node<K, V>(key, value);

		if (bucketArray[index] == null) {
			System.out.println("NULL");
			List<Node<K, V>> list = new LinkedList<Node<K, V>>();
			list.add(node);
			bucketArray[index] = (LinkedList<Node<K, V>>) list;
		} else {
			List<Node<K, V>> list = bucketArray[index];
			Iterator<Node<K, V>> itr = list.iterator();
			int count=0;
			while (itr.hasNext()) {
				count++;
				System.out.println("NOT NULL EQUALS");
				Node<K, V> nodeNext = itr.next();
				if (key.equals(nodeNext.getKey())) {
					nodeNext.setValue(value);
					flag = true;
				}else if(list.size()==count){
					list.add(count-1, node);
				}
			}
		}
		System.out.println(index + " " + key.hashCode() % bucketArray.length);
		return value;

	}

	public V get(K key) {
		int index = key.hashCode() & (bucketArray.length - 1);

		if (bucketArray[index] == null) {
			return null;
		} else {
			Iterator<Node<K, V>> itr = bucketArray[index].iterator();

			while (itr.hasNext()) {
				Node<K, V> node = itr.next();
				if (key.equals(node.getKey())) {
					return node.getValue();
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		DemoHashMap<String, Integer> dhm = new DemoHashMap<String, Integer>();
		dhm.put("LOL", 10);
		dhm.put("LOL", 20);
		
		int x = dhm.bucketArray[9].get(0).getValue();
		System.out.println(x + "%%%%");
	}

}

// node class
class Node<K, V> {
	private K key;
	private V value;
	private Node<K, V> next;

	public Node(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}

}
