package com.Arrayclass;

public class MultiDimensional {

	public static void main(String[] args) {
		
		int array[][]=new int[2][2];
		
		array[0][0]=10;
		array[0][1]=20;
		array[1][0]=30;
		array[1][1]=40;
		
		System.out.println(array[0][1]);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i][i]);
			
			
		}

	}

}
