package com.String_Types;

public class Literal_Immutable {

	public static void main(String[] args) {
		
		String refname="AKASH";   
		
		System.out.println(System.identityHashCode(refname)); //identity hashcode==  it is used to print the reference value(storage reference)
		
	    String refname1="AKASH";
		
		System.out.println(System.identityHashCode(refname1));
		
		String value=refname.concat(refname1);
	      //	System.out.println(value);
    System.out.println(System.identityHashCode(value));

//////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("NON LITRAL_MUTABLE");
		
		String s=new String ("AB");
		
		System.out.println(System.identityHashCode(s));
		
        String s1=new String ("AB");
		
		System.out.println(System.identityHashCode(s1));
	
		
	
	}

}
