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
	  
	  public void addFirst(T item) {
		    Node<T> newNode = new Node<>(item);

		    if (head == null) head = newNode;
		    else {
		      newNode.next = head;
		      head = newNode;
		    }
		  }

		  public void display() {
		    if (isEmpty()) {
		      System.out.println("list empty! nothing to display");
		      return;
		    }

		    Node<T> temp = head;
		    while (temp.next != null) {
		      System.out.print(temp.data + " -> ");
		      temp = temp.next;
		    }
		    System.out.println(temp.data);
		  }

		  private boolean isEmpty() {
		    if (head == null) 
		    	return true;
		    return false;
		  }

		}

	class Node<T> {

	  T data;
	  Node<T> next;

	  Node(T data) {
	    this.data = data;
	  }
	}
