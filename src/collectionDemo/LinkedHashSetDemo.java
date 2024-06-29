package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/*
	 * LinkedHashSet is implements Set interface
	 * Underline data structure is Doubly linked list
	 * It has features of List(It is ordered collection) and set(It maintains unique elements)
	 * It child class for HashSet
	 */
	public static void main(String[] args)
	{

		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		ls.add(40);
		
		System.out.println("Is LinkedHashSet empty?: "+ls.isEmpty());
		
		System.out.println("Total Elements are: "+ls.size());
		
		System.out.println(ls);
		
		System.out.println(ls.contains(60));
		System.out.println(ls.contains(30));
		
		
		
		ls.remove(30);
		
		System.out.println(ls);
		
		
		
		
		
		

	}

}