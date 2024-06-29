package collectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class implements Set interface
	 * Underline data structure is Search Tree
	 * TreeSet implements Sorted Set who extends Set interface
	 * Ascending Order
	 */
	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(90);
		ts.add(12);
		ts.add(66);
		ts.add(100);
		ts.add(11);
		ts.add(40);
		ts.add(40);
		
		
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		
		System.out.println(ts);
		
			
		System.out.println(ts.descendingSet());
		
		
		List<Integer> l1=Arrays.asList(10,20,30,40,50);
		System.out.println(l1);
		
		TreeSet<Integer> ts2=new TreeSet<Integer>(l1);
		System.out.println(ts2.descendingSet());
		
		
		
		
		

	}

}