package com.ScannerProgram;      //Scanner class

import java.util.Scanner;

public class Program {
	
	public static void main(String args[]) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("enter the first name");
		String s=x.next();
		System.out.println(s);
		
		System.out.println("enter the middle name");
		String s1=x.nextLine();
		System.out.println(s1);
		
		System.out.println("enter the year");
		int i=x.nextInt();
		System.out.println(i);
		
		System.out.println("enter the salary");
		float f=x.nextFloat();
		System.out.println(f);
		
		System.out.println("enter the sec");
		char c=x.next().charAt(6);
		System.out.println(c);
		
		
		System.out.println("enter the date");
		byte b=x.nextByte();
		System.out.println(b);
		
		System.out.println("enter the month");
		short m=x.nextShort();
		System.out.println(m);
		
		System.out.println("enter the phone number");
		long l=x.nextLong();
		System.out.println(l);
		
		
		System.out.println("enter the time");
		double d=x.nextDouble();
		System.out.println(d);
		
		System.out.println("true or false");
		boolean y=x.nextBoolean();
		System.out.println(y);
		
		System.out.println("enter the last name");
		String s3=x.next().toString();
		System.out.println(s3);
		
		
		}
	}


