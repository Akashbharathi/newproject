package com.Collection;// TREE SET PROGRAM 
import java.util.TreeSet;

import java.util.Set;


public class Tree_Set {
	
	public static void main(String[] args) {
		
		Set<String> refname=new TreeSet<>();  // SYNTAX
		
		
		refname.add("akash");   // it will prints Acending order  
		refname.add("greens");  // alphabettics order vise( A to Z )...
		refname.add("tech");    // FIRST LETTER  ONLY take ASCENDING ORDER
		refname.add("java");
		refname.add("selenium");
		refname.add("tech");    // it will not allow duplicate value 
		
		System.out.println(refname);
		
		int size = refname.size();
		System.out.println(size);
		
		boolean contains = refname.contains("tech");
		System.out.println(contains);
		
		//refname.clear();
      //  System.out.println(refname);
         
         Set<String> refname2=new TreeSet<>();
         
     refname2.add("program");   // it will prints Acending order  
     refname2.add("collection");  // alphabettics order vise( A to Z )...
 	 refname2.add("set");    // FIRST LETTER  ONLY take ASCENDING ORDER
 	 refname2.add("list");
 	 refname2.add("akash");
 		
 		//System.out.println(refname2);
 		
 		//refname2.addAll(refname);
 		//System.out.println(refname2);// it will not accept duplicate value
 		
 		//refname2.retainAll(refname);
 		//System.out.println(refname2);
 		
 		refname.removeAll(refname2);
 		System.out.println(refname);
 		
 		
 		
 		
 		
 		
 		
         
         
         
         
		
		
	}

}
