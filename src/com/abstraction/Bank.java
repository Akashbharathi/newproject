package com.abstraction;     // ABSTRACT CLASS

public abstract class Bank {
	
	//String name="akash";
	
	public void accountholdername(String name) {
		System.out.println(name);    //implementation part hide
		}
	
	public abstract void accountno();
	
	public abstract void atmno();      // remove method body
}
