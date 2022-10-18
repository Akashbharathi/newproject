package com.polymorphism;

public class Overring extends MethodOverRiding{
	@Override
	public void studentname(String name) {
		
		super.studentname(name);
	}
	
	@Override
	public void studentid(int id) {
		
		super.studentid(id);
	}
	
	@Override
	public void studentphonenumber(long number) {
		
		super.studentphonenumber(number);
	}
	
   //METHOD CALLING
	
	public static void main(String[] args) {
		//OBJECT
		Overring n = new Overring();
		
		n.studentname("akash");
		n.studentid(12);
		n.studentphonenumber(9876544321l);
	}
	

}
