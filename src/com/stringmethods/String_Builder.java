package com.stringmethods;

public class String_Builder {
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.out.println("!!! STRING BUILDER !!!");
		
	StringBuilder refname = new StringBuilder("AKASH BHARATHI");  
	System.out.println(System.identityHashCode(refname));
	
	StringBuilder refname1 = new StringBuilder("AKASH BHARATHI");
	System.out.println(System.identityHashCode(refname1));
	
	System.out.println(System.identityHashCode(refname1.append(refname))); //MEMORY SHAREED
                        System.out.println(); // next line use     
	                        
	
///////////////////////////////////////////////////////////////////////////////	
	
	               
	       System.out.println("!!! STRING BUFFER !!!");
	
	StringBuffer Buffer = new StringBuffer("GREENS TECHNOLOGIES");
	System.out.println(System.identityHashCode(Buffer));
	Thread.sleep(2000);
	
	StringBuffer Buff = new StringBuffer("GREENS TECHNOLOGIES");
	System.out.println(System.identityHashCode(Buff));
	Thread.sleep(2000);
	
	System.out.println(System.identityHashCode(Buffer.append(Buff)));
	Thread.sleep(2000);
	
		
	}

}
