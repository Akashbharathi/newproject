package com.Collection;


import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table {

	public static void main(String[] args) {
		
		Map<String, String> ipl=new Hashtable<>();
		
		ipl.put("CSK", "dhoni");   // it will prints RANDOM ORDER
		ipl.put("RCB", "virat");   // KEY AND VALUE NOT ALLOW NULL 
		ipl.put("MI", "rohit");
		ipl.put("GT", "pandya");
		ipl.put("ipl", "pandya");  // duplicate value accept
		
		System.out.println(ipl);
		
		int size = ipl.size();
		System.out.println(size);
		
		String string = ipl.get("RCB");
		System.out.println(string);
		
		Set<String> keyset = ipl.keySet();
		System.out.println(keyset);
		
		Collection<String> values = ipl.values();
		System.out.println(values);
		
		boolean Key = ipl.containsKey("ipl");
		System.out.println(Key);
		
		boolean value = ipl.containsValue("sachin");
		System.out.println(value);
		
		Set<Entry<String, String>> entrySet = ipl.entrySet();
		System.out.println(entrySet);

	}

}
