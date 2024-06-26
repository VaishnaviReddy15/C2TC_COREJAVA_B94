package edu.atria.B94collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List list =new List(); cannot intantiate list interface
		//type safety can be given in arraylist
		List<Integer> li =new ArrayList();
		System.out.println("elements in the list"+li);
		li.add(1);
		//li.add("Address");
		//li.add(true);
		System.out.println("elements in the list:"+li);
		li.add(null);
		li.add(null);
		//li.add("Address");
		System.out.println("elements in the list:"+li);
		//duplicate elements can be added in Array list
		//list is going to take hetrogeneous data

	}

}
