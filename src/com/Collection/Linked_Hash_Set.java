package com.Collection;    // LINKED HASH SET PROGRAM


import java.util.LinkedHashSet;

import java.util.Set;


public class  Linked_Hash_Set{

	public static void main(String[] args) {
		
		
		Set<Integer> refname=new LinkedHashSet <>();
		
		
		refname.add(7);     // in prints in insertion order
		refname.add(5);
		refname.add(6);
		refname.add(5);      // it will not allow duplicate values
		refname.add(null);  // it will allow single null value
		refname.add(null);  // it will allow single null value
		System.out.println(refname);
		
		int size = refname.size();   
		System.out.println(size);
		
		boolean contains = refname.contains(null);
		System.out.println(contains);
		
		//refname.clear();
		//System.out.println(refname); // clear all values
		
		Set<Integer> refname2=new LinkedHashSet<>();
		
		refname2.add(8);
		refname2.add(10);
		refname2.add(9);
		refname2.add(5);
		
		System.out.println(refname2);
		
		//refname2.addAll(refname);
		//System.out.println(refname2);
		
		//refname2.retainAll(refname);
		//System.out.println(refname2);
		
		refname.removeAll(refname2);
		System.out.println(refname);
		
		
		
		
		
		
		

	}

}
