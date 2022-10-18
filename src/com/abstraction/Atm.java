package com.abstraction;         // ABSTRACT CLASS


public class Atm extends Bank {      // add unimplemented path

	@Override
	public void atmno() {
		System.out.println(2222);
		}
	@Override
	public void accountno() {
		System.out.println(12345678908l);
		
		
	}

	//main method
	public static void main(String[] args) {
		
		//object
		
		Atm A=new Atm();
		
		A.accountholdername("akash");
		A.accountno();
		A.atmno();
	}

	
}
