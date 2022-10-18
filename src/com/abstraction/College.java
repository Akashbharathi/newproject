package com.abstraction;

public class College implements CollegeDetails {
	
	@Override
	public void collegename() {
		System.out.println("s.k.r.engineering college");
		
	}
	@Override
	public void collegecode() {
		System.out.println(2120);
		
	}
	@Override
	public void collegephonenumber() {
		System.out.println(98976654444l);
		
	}
	
	   // method calling
	public static void main(String[] args) {
		
		// object
		College x = new College();
		
		x.collegename();
		x.collegecode();
		x.collegephonenumber();
	}
       
}
