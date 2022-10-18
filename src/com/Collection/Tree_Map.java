package com.Collection;

import java.util.Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> refname=new  TreeMap<>();
		
		refname.put(4, 10);  // IT WILL PRINTS ACENDING ORDER
		refname.put(2, 20);  // KEY NOT ALLOW EVEN SINGLE NULL
		refname.put(1, 30);   // duplicate keys not allow 
		refname.put(3, 40);
		//refname.put(1, 310); // duplicate keys given THE value will be
		refname.put(7, 40);        // OVERRRIDE(NEXT VALUE) 
		refname.put(13,null );    // multiple null will accept VALUE
		refname.put(113,null );  // duplicate values allowed
System.out.println(refname);
		
// TO FIND LENGTH
		
		int size = refname.size();
		System.out.println(size);
		
// TO PRINT PARTICULAR VALUE
		
		Integer integer = refname.get(4);
		System.out.println(integer);
		
// TO PRINT KEYS ONLY
		
		Set<Integer> keySet = refname.keySet();
		System.out.println(keySet);
		
// TO PRINT VALUES
		
		Collection<Integer> values = refname.values();
		System.out.println(values);
		
//  to print containskey
		
		boolean containsKey = refname.containsKey(1);
		System.out.println(containsKey);
		
		boolean containsvalue = refname.containsValue(40);
		System.out.println(containsvalue);

// to find entry set
		
		Set<Entry<Integer, Integer>> entryset = refname.entrySet();
		System.out.println(entryset);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
