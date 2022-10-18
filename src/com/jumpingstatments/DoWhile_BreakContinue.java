package com.jumpingstatments;    // do while===> break and continue

public class DoWhile_BreakContinue {
	
	public static void main(String[] args) {
		
		int count=1;
		do {
			
			if (count==7) {
				count++;
				continue;
				
			}
			System.out.println(count);
			count++;
			} 
		
		while (count<9);   
		}

}
/*
 * int count=1;
		do {
			
			if (count==7) {
				
				break;
				
			}
			System.out.println(count);
			count++;
			} 
		
		while (count<9);
		
 */

