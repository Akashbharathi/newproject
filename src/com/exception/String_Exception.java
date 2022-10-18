package com.exception;

import java.util.Scanner;

public class String_Exception {

	public static void main(String[] args) throws Exception {

   /*  String s="java";
     
     char c = s.charAt(4);
     System.out.println(c);*/
     
     
     int num[]=new int [4];
     num[0]=1;
     num[1]=2;
     num[2]=3;
     num[3]=4;
     try {
		System.out.println(num[4]);
	} 
     catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("this is array index");
	}
     finally {
    	 
    	System.out.println("end program");
     }
     
     for(int i=1;i<=10;i++) {
    	if(i==4) {
    		throw new Exception();
    	}
    	 System.out.println(i);
     }
     
     
     
     
     
     
     
     
     
     
		
	/*String s1=null;
	System.out.println(s1.length());*/
		
	
	/*
	 System.out.println("start");
	 System.out.println("1");
	 System.out.println(10/0);
	 System.out.println("end");*/
		
/*	Scanner sc=new Scanner(System.in);
	System.out.println("ENTERR THE VALUE");
	int i=sc.nextInt();
	 System.out.println(i); */
		
	/*	String m="akash";
		int i=Integer.parseInt(m);
		System.out.println(i);*/
	 

	}

}
