package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{
	/*
	 * HashMap is class implements Map interface
	 * Underline data structure is HashTable
	 * 
	 * HashMap maintains data in <key=value>
	 * 
	 * put()
	 * get()
	 */

	public static void main(String[] args)
	{
			
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Viman Nagar",411014);
		hm.put("Lohegaon",411047);
		hm.put("Wagholi",411048);
		hm.put("Kharadi",411047);
		
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		
		System.out.println("Search Key: "+hm.containsKey("Kharadi"));
		
		System.out.println("Search value: "+hm.containsValue(411048));
		
		
		System.out.println(hm.get("Lohegaon"));
		
		
		hm.remove("Kharadi");
		
		System.out.println(hm);
		System.out.println("********Iterate map*************");
		/*
		 * Entry is interface in java under Map
		 * entrySet()==>Return Type is Set<Entry<String,Integer>>
		 */
		for(Entry<String,Integer> i:hm.entrySet())
		{
			//System.out.println(i);
			System.out.println(i.getKey()+" : "+i.getValue());
			
		}
		System.out.println("*************************");
		/*
		 * iterator() is available in Collection
		 * 
		 * If you want to use iterator() for map
		 * Then use entrySet()-->map into set
		 */
		
		
		Set<Entry<String,Integer>> set1=hm.entrySet();
		
		Iterator<Entry<String,Integer>> ir=set1.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
			

	}

}