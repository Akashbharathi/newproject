package com.HANDLING_EXCEPTION;

public class Arithmetic {
	public static void main(String[] args) throws Exception {
		

		int i=0;
		int i1=10;
		
		
		try {
			int result=i1/i;
		    System.out.println(result);
		}
		catch(ArithmeticException e) {
		e.printStackTrace();
		
		System.out.println("the program will be handled");
		
	}
		finally {
			
			System.out.println("end the program");
		}
		
		int j=0;
		do {
			
			if(j==8) {
			throw new Exception();
		}
			
			System.out.println(j);
			j++;
			
	}
		while(j<=10);
	

	}
}
