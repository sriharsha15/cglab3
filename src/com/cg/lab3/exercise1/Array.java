package com.cg.lab3.exercise1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int index=0;index<n;index++)
		{
			array[index]=sc.nextInt();
		}
		Small obj = new Small();
        System.out.println(obj.getSecondSmallest(array));
        sc.close();
	}

}
