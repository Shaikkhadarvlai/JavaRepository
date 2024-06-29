package collectionDemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	/*
	 * Vector is class implements List interface
	 * Underline data structure is Dynamic array
	 * Vector is synchronized
	 * Performance wise vector is slow so we don't follow in real time
	 * 
	 * 
	 */

	public static void main(String[] args)
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is list empty: "+v1.isEmpty());
		
		if(v1.isEmpty())
		{
			//insert
			v1.add(80);
			v1.add(10);
			v1.add(30);
			v1.add(20);
			v1.add(80);
			v1.add(50);
		}
		
		System.out.println(v1);
		
		System.out.println("Total Elements are: "+v1.size());
		
		v1.remove(0);
		
		System.out.println(v1);
		v1.add(0,20);
		
		System.out.println(v1);
		System.out.println(v1.contains(100));//false
		System.out.println(v1.contains(50));//true
		
		System.out.println("****Iteration**********");
		for(Integer i:v1)
		{
			System.out.println(i);
		}
		
		System.out.println("****Iteration using iterator()**********");

		
		Iterator<Integer> ir=v1.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		

	}

}