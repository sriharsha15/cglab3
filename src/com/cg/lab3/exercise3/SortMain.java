package com.cg.lab3.exercise3;

import java.util.Scanner;

public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int index=0;index<n;index++)
		{
			array[index]=sc.nextInt();
		}
		Sort obj=new Sort();
		int output[]=obj.getSorted(array);
        for(int index=0;index<output.length;index++)
        {
     	   System.out.println(output[index]);
        }
            sc.close();

	}

}
