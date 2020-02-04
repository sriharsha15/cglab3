package com.cg.lab3.exercise3;

import java.util.Arrays;

public class Sort {
	public int[] getSorted(int array[])
	{
		StringBuffer s[]=new StringBuffer[array.length];
		
		for(int index=0;index<array.length;index++)
		{
			s[index]=new StringBuffer(""+array[index]);
			s[index].reverse();
		}
		int array3[]=new int[array.length];
		for(int index=0;index<array.length;index++)
		{
		 array3[index]=Integer.parseInt(s[index].toString());

		 }
		Arrays.sort(array3);
		return array3;
	}	

}
