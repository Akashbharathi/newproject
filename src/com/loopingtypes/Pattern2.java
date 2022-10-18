package com.loopingtypes;

public class Pattern2 {
	
	public static void main(String[] args) {
		

		System.out.println("**Pattern program star method**");
		
		 for(int i=1;i<=10;i++) {       //outer loop
			for(int j=10;j>=i;j--) {    //inner loop
				System.out.print("*");
			    }
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("**Pattern program number method**");
		
		        for(int i=1;i<=10;i++) {       //outer loop
			         for(int j=10;j>=i;j--) {    //inner loop
				      System.out.print(j);
			       }
			System.out.println();
		   }
		
	}

}
