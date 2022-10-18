package com.Arrayclass;

public class NestedArray {            
	
	public static void main(String[] args) {
		
		for (int i = 0; i <9; i++) {          //PATTERN PROGRAM
			for (int j = 9; j >i; j--) {                  
				System.out.print(j);
				
				}
			System.out.println();
			}
	}

}

/*
   initialization      condition checking        sysout         iteration
                        9 8 7 6 5 4 3 2 1 
                         
   j=9                    true                  987654321         9-1=8
   j=8                    true                  98765432          8-1=7
   j=7                    true                  9876543           7-1=6
   j=6                    true                  987654            6-1=5
   j=5                    true                  98765             5-1=4
   j=4                    true                  9876              4-1=3
   j=3                    true                  987               3-1=2
   j=2                    true                  98                2-1=1
   j=1                    true                  9                 1-1=0
   
   j=0                   FALSE ===> exit
   
 */

