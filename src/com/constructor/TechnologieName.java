package com.constructor;

public class TechnologieName {
	
	//==> NO PARAMETRIZED ARGUMENTS default constructor
	
	String name;  // when we created an object for class the default constructor exwcuted automatically.
	int number;
	
	public TechnologieName() {   
		System.out.println("No Parametrized Arguments");
	}
	
////////////////////////////////////////////////////////////////////
	
	  //==> PARAMETERIZED ARGUMENTS
	
	public TechnologieName(String name,int id,long fees) { 
		
		System.out.println("the name is="+name);
		System.out.println("the id is="+id);
		System.out.println("the feees is="+fees);
		
	}
	
	
	public static void main(String[] args){
	        	 
		TechnologieName obj=new TechnologieName();
		System.out.println(obj.name);
		System.out.println(obj.number);
		
		TechnologieName obj1=new TechnologieName("greens",12, 17000 );
		
		
		
		
		
	
		
		
	}
	
	
	
	

}
