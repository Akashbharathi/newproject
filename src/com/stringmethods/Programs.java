package com.stringmethods;

public class Programs {
	
	public static void main(String[] args) {
		String s1="java with selenium";
		
		String s= "Greens Technologies";   // litral==> STORED IN (String constant pool)
		        
		int count=s1.length();
		System.out.println(count);
		
/*String s1=new String("Greens Technologies"); // non litral==>obeject==>stored in HEAP MEMORY
		
int count1=s.length();
System.out.println(count1);*/
		
		boolean b=s.equals(s1);
		System.out.println(b);
		
		boolean b1=s.equalsIgnoreCase(s1);
		System.out.println(b1);
		
		String caps=s1.toUpperCase();
		System.out.println(caps);
		
		String small=s.toLowerCase();
		System.out.println(small);
		
		boolean bool=s.startsWith("Greens");// first letter or first word
		System.out.println(bool);
		
		boolean bool1=s.endsWith("s");   // last letter or last word
		System.out.println(bool1);
		
		boolean bool2=s.contains("Greens");
		System.out.println(bool2);
		
		int i=s.indexOf("T");
		System.out.println(i);
		
		int i1=s.lastIndexOf("g");
		System.out.println(i1);
		
		String change=s1.replace( "java","jaVa" );
		System.out.println(change);
		
		char c=s.charAt(15);    // index value
		System.out.println(c);
		
		String value =s.substring(3);
		System.out.println(value);
		
		String value1=s.substring(3, 9);
		System.out.println(value1);
		
		boolean bool3=s.isEmpty();
		System.out.println(bool3);
		
		String trim=s.trim();
		System.out.println(trim);
		
		System.out.println(" * split *");
		String[] split=s.split("");
		for (String refname : split) {
			
			System.out.println(refname);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
