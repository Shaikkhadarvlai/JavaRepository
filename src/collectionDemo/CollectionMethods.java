package collectionDemo;

import java.util.ArrayList;

public class CollectionMethods {

	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * Frequent operation for ArrayList is data retrieval
	 * List is Ordered collection
	 * List allowed duplication 
	 * 
	 * Default capacity is 10 virtual segment
	 * ArrayList is non synchronized class
	 * Methods:
	 * add(),get(index),size(),add(index,value),remove(index),isEmpty()
	 * clear(),contains()
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is list empty?: "+al.isEmpty());//true
		al.add(80);
		al.add(20);
		al.add(30);
		al.add(70);
		al.add(20);
		al.add(60);
		
		System.out.println(" After adding the elements Is list empty?: "+al.isEmpty()); //false
		System.out.println("Total Elements are: "+al.size());
		System.out.println(al);
		//insert the element at 0th position
		al.add(0,10);
		System.out.println(al);
		//to remove any element from 3rd position-30
		al.remove(3);
		System.out.println(al);
		
		al.add(90);
		al.add(100);
		al.add(10);
		
		System.out.println(al);
		al.add(null);
		al.add(null);
		//null is unknown value
		
		System.out.println(al);
		
		System.out.println("check for 100?: "+al.contains(100));//true
		System.out.println("Check for 160?: "+al.contains(160));//false
		
		
		System.out.println(al.get(0));
		
		
		
		//to remove all the elements
//		al.clear();
//		System.out.println(al);//[]
		
		
		
	
	}

}