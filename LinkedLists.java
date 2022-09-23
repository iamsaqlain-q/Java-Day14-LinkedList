package com.bl.linkedlist;

public class LinkedLists<T> {

	  Node<T> head;

	  public void addLast(T item) {
	    Node<T> newNode = new Node<>(item);
	    if (head == null) head = newNode;
	    else if (head.next == null) head.next = newNode; 
	    else {
	      Node<T> temp = head;
	      while (temp.next != null) temp = temp.next;
	      temp.next = newNode;
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
