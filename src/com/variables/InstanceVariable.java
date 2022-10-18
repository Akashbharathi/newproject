package com.variables;

public class InstanceVariable {
	
	byte b=115;           // INSIDE THE CLASS
	String s="akash";
	
	public static void main(String args []) {
		
		 InstanceVariable obj=new InstanceVariable() ;  
		 
	    System.out.println(obj.b);
		System.out.println(obj.s);
		
		
		
		
	}

}
