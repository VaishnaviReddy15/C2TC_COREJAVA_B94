package edu.atria.B94collections;


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println("the number of list"+li);
		li.add(1,15);
		System.out.println("the number of list:"+li);
		li.add(0,15);
		System.out.println("the number of list:"+li);
		//IndexOutOfBoundException if index is negative or greater than size
		/*li.add(7,15);
		System.out.println("the number of list:"+li);*/
		//  to add first and last element
		li.addFirst(0);
		li.addLast(40);
		System.out.println("the number of list:"+li);
		
		System.out.println("first element is:"+li.getFirst());
		System.out.println("first element is:"+li.getLast());
		//to remove first and last element
		li.removeFirst();
		li.removeLast();
		System.out.println("first element is:"+li);
		
		
		
		

	}

}
//linkedlist is not synchronized
//we use doubly linked list data structure
