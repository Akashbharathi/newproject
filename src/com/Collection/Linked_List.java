package com.Collection;
                           // ARRAY LIST AND LINKED LIST

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		
		List<String> names=new LinkedList<>();
		
		names.add("akash");     // 0 index
		names.add("nithi");     // 1 index
		names.add("karthick");  // 2 index
		names.add("vimal");     // 3 index
		names.add("sathish");   // 4
		names.add("sathish");   // 5 index   it allows duplicate values
		
		System.out.println(names);
		
		int size = names.size();
		System.out.println(size);
		
		String valueget = names.get(4);
		System.out.println(valueget);
		
		int indexof = names.indexOf("vimal");
		System.out.println(indexof);
		
		boolean contains = names.contains("greens");
		System.out.println(contains);
		
		//names.set(4, "abi mam");
		//System.out.println(names);
		
		names.remove(3);
		System.out.println(names);
		

		
		List<String> name2=new LinkedList<>();
		
		name2.add("kavitha");
		name2.add("tech");
		name2.add("akash");
		System.out.println(name2);
		
	    //name2.addAll(names);
	    //System.out.println(name2);
	    
		
		
		//name2.retainAll(names);        // same names get retained
		//System.out.println(name2);
		
		names.removeAll(name2);
		System.out.println(names);        // same name remove other printed
		
		//names.clear();
	  //  System.out.println(names);
		
		
		}

}






















