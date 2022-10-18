package com.Collection;  // LINKED HASH MAP and Hash
                                     // hash map== a=random order
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Hash_Map {
        
	public static void main(String[] args) {
		
		Map<Integer, String> refname =new LinkedHashMap<>();
		
		refname.put(07, "DHONI");    // INSERTION ORDER PRINTS
		refname.put(18, "KOHLI");
		refname.put(17, "ABD");      // key NO duplicate 
		refname.put(33, "PANDYA");   // VALUE allow duplicate
		refname.put(null, "raina");  // key one NULL accept
		
		refname.put(12, null);       // VALUE MULTIPLE NULL accept
		   
	   System.out.println(refname);  
		
// to find length
		
		int size = refname.size();
		System.out.println(size);
		
// to print particular value
		
		String string = refname.get(33);
		System.out.println("33 no value=="+string);
		
// to print only KEYS
		
		Set<Integer> keySet = refname.keySet();
		System.out.println(keySet);
		
// to print only values
		
		Collection<String> values = refname.values();
		System.out.println(values);
		
// to check keys 
		
		boolean containsKey = refname.containsKey(12);
		System.out.println(containsKey);
		
// to check values
		
		boolean containsValue = refname.containsValue("ABD");
		System.out.println(containsValue);
		
// to print key and values
		
		Set<Entry<Integer, String>> entrySet = refname.entrySet();
		System.out.println(entrySet);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

