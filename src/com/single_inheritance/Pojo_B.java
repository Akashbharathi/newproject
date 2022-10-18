package com.single_inheritance;

public class Pojo_B {

	public static void main(String[] args) {
		
		Pojo_A obj=new Pojo_A();
		
		obj.setStudentname("akash");
		obj.setStudentid(12);
		obj.setStudentphnno(3456789345678l);
		
		String name = obj.getStudentname();
		System.out.println(name);
		
		System.out.println(obj.getStudentid());
		System.out.println(obj.getStudentphnno());
		
		

	}

}
