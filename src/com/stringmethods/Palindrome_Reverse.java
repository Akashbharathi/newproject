package com.stringmethods;       // REVERSE METHOD

public class Palindrome_Reverse {
	public static void main(String[] args) {
		
		String name="JAVA";
		
		int l=name.length();   // for(int i=name.length()-1;i>=0;i--)
		
		for(int i=l-1;i>=0;i--) {
			
			char reverse= name.charAt(i);
			
			System.out.print(reverse);
		}
/////////////////////////////////////////////////////////////////	
		
		System.out.println("****USING EMPTY STRING****");
		String refname="amma";
		String reversing="";
		
		for(int i=refname.length()-1;i>=0;i--) {
			
			reversing =reversing+ refname.charAt(i);
			
			}
		
		System.out.println(reversing);
		
		if(refname.equals(reversing)) {
			
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
				
		
	}

}
