package com.bl.linkedlist;

import java.util.ArrayList;

public class LinkedLists<T> {

	Node<T> head;

	public void addLast(T item) {
		Node<T> newNode = new Node<>(item);
		if (head == null)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			Node<T> temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}

	private boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void addFirst(T item) {
		Node<T> newNode = new Node<>(item);

		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("list is empty! ");
			return;
		}

		Node<T> temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void displayFromEnd() {
		if (isEmpty()) {
			System.out.println("list is empty! ");
			return;
		}

		ArrayList<T> nodes = new ArrayList<>();
		Node<T> temp = head;

		while (temp.next != null) {
			nodes.add(temp.data);
			temp = temp.next;
		}
		nodes.add(temp.data);

		for (int i = nodes.size() - 1; i > 0; i--) {
			System.out.print(nodes.get(i) + " -> ");
		}
		System.out.println(nodes.get(0));
	}

	public void insertAt(int index, T item) {
		int count = 0;
		if (index < 1 || index > count + 1) {
			System.out.println("invalid index" + (count + 1));
			return;
		} else if (index == 1) {
			if (head == null)
				System.out.println("list empty! adding " + item + " at index 1.");
			addFirst(item);
		} else if (index == count + 1)
			addLast(item);
		else {
			Node<T> newNode = new Node<>(item);
			Node<T> temp = head;

			for (int i = 1; i < index - 1; i++)
				temp = temp.next;
			newNode.next = temp.next;
			temp.next = newNode;
			count++;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty!");
			return;
		} else
			head = head.next;
	}
	
	public void pop() {
	    if (head == null) {
	      System.out.println("list is empty!");
	      return;
	    } else head = head.next;
	  }

	  public void popLast() {
	    if (head == null) {
	      System.out.println("list is empty!");
	      return;
	    } else if (head.next == null) head = head.next;
	    else {
	      Node<T> temp = head;

	      while (temp.next.next != null) temp = temp.next;
	      System.out.println("deleted " + temp.next.data);
	      temp.next = null;
	    }
	  }
}

class Node<T> {

	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}
