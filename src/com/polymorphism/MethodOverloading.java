package com.polymorphism;             // METHOD OVERLOADING

public class MethodOverloading {
	
	private void studentdetails(long phonenumber) {
		System.out.println("studentphonenumber=" + phonenumber); // DataType
		

	}
	private void studentdetails(int id, char sec, double fees) {  // DataType order
		System.out.println("student id=" + id);
		System.out.println("student sec="+ sec);
		System.out.println("student fees=" + fees);
	}
		

	
	
	private void studentdetails(int m,int m1,int m2) {     //Data Count
		System.out.println("student subject=" +m+" "+ m1+" "+ m2);
		

	}
	public static void main(String[] args) {
		MethodOverloading s= new MethodOverloading();
		s.studentdetails(9897373882l);
	    s.studentdetails(12, 'A', 1234d);
		s.studentdetails(88,77,88);
		
	}
	
	}


