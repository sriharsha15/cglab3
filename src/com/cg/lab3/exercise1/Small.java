package com.cg.lab3.exercise1;


public class Small {
	
	public int getSecondSmallest(int array[])
	{
		//Arrays.sort(array);
		int temp,index,index1;
		for(index=0;index<array.length;index++)
		{
			for(index1=index+1;index1<array.length;index1++)
			{
				if(array[index]>array[index1])
				{
					temp=array[index];
					array[index]=array[index1];
					array[index1]=temp;
				}
			}
		}
		return array[1];
	}
}
