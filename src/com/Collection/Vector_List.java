package com.Collection;

import java.util.List;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		
		List<Integer> vector=new Vector<>();
		
		vector.add(5) ;
		vector.add(10);
		vector.add(15);
		vector.add(20);
		vector.add(25);
		
		System.out.println(vector);
		
		
		 int size = vector.size();
		System.out.println(size);
		
		 int integer = vector.get(3);     // index value given == value out
		 System.out.println("VALUE BASIS="+integer);
		 
		 int indexOf = vector.indexOf(20);   // value given== index out
		 System.out.println("INDEX BASIS="+indexOf);
		 
		 boolean contains = vector.contains(9);
		 System.out.println(contains);
		 
		 vector.set(2, 30);
		 System.out.println(vector);
		 
		 //vector.remove(1);
		// System.out.println(vector);
		 
		 List<Integer> vector2=new Vector<>();
		 
		 vector2.add(35);
		 vector2.add(40);
		 vector2.add(45);
		 
		 //vector.addAll(vector2);
		// System.out.println(vector);
		 
		vector2.retainAll(vector);
		 System.out.println(vector2);
		 
		// vector2.removeAll(vector);
		// System.out.println(vector2);
		 
		 vector2.clear();
		 System.out.println(vector2);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		

	}

}
