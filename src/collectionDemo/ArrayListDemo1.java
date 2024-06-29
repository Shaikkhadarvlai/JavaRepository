package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class implements List interface
	 * Under line data structure is Dynamic array
	 * 
	 * List is Ordered collection
	 * List allowed duplication 
	 * 
	 * Default capacity is 10 virtual segment
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		
		//List with inerface
		List<Integer> l1=new ArrayList<Integer>();
		
		
		//Generic way- type safe and no type casting required
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(70);
		al.add(20);
		
		System.out.println(al);
		
		int num=al.get(0);
		System.out.println(num);//10
		
		System.out.println("*******************************");
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nagpur");
		
		System.out.println(loc);
		
		
		
		
		
		
		
		/*
		//Non Generic Way- 1.It is not type safe 2.it need type casting
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add('M');
		a1.add("Sarang");
		a1.add(89.78);
		ArrayList is a raw type.
		 *  References to generic type ArrayList<E> should be 
		 parameterized
		
		System.out.println(a1);
		
		int num=(int)a1.get(0);
		System.out.println(num);//100
		
		*/
		
	
	}

}