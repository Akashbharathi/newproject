package com.Arrayclass;



public class DemoArray {
	
	public static void main(String []args) {
		
//    DataType variablename[]=new Datatype[length];
		
		int number[]=new int[10];
		
		number[0]=34;
		number[1]=85;
		number[2]=99;
		number[3]=48;
		number[4]=23;
		number[5]=54;
		number[6]=44;
		number[7]=56;
		number[8]=36;
		number[9]=74;
		System.out.println("normal array");
		System.out.println(number[1]);
		
//////////////////////////////////////////////////////////////////////////////
		System.out.println("***FOR LOOP***");
		for (int i = 0; i < 10; i++) {
			System.out.println(number[i]);
			
		}
/////////////////////////////////////////////////////////////////////////////		
		System.out.println("***DO WHILE LOOP***");
		int i1=0;
		do {
			System.out.println(number[i1]);
			i1++;
			} while (i1<number.length);
//////////////////////////////////////////////////////////////////////////////
		System.out.println("***WHILE LOOP");
		int i2=0;
		while (i2<number.length) {
			System.out.println(number[i2]);
			i2++;
			
		}
		
		}
	

}
