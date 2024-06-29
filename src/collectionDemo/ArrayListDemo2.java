package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

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
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println("Total elements: "+al.size());
		System.out.println("Iteration **************");
		
		for(Integer i:al)
		{
			System.out.println(i);
		}
			
		System.out.println("*******************************");
		
		ArrayList<Double> ad=new ArrayList<Double>();
		ad.add(90.67);
		ad.add(34.88);
		ad.add(68.45);
		
		System.out.println(ad);
		System.out.println("Total elements: "+ad.size());
		System.out.println("Iteration **************");
		for(Double i:ad)
		{
			System.out.println(i);
		}
		System.out.println("***********************************");
		 
		ArrayList<String> name=new ArrayList<String>();
		name.add("Kumar");
		name.add("Smita");
		name.add("Pranita");
		System.out.println("Iteration **************");
		for(String i:name)
		{
			System.out.println(i);
		}
		System.out.println("Total elements: "+name.size());
		System.out.println(name);
		
		System.out.println("***********************************");
		 
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(101);
		list.add("Sarang");
		list.add('M');
		list.add(89.78);
		list.add(989709876L);
		
		System.out.println(list);
		
		
//		Object num=list.get(0);
//		System.out.println(num);
//		
		System.out.println("Iteration **************");
		
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		
		
	
	}

}