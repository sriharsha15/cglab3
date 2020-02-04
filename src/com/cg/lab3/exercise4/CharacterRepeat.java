package com.cg.lab3.exercise4;

public class CharacterRepeat {

	public void characterArray(char c[])
	{
		int result = 0;
		for(int index=0;index<c.length;index++)
		{
			 int count=1;
			
			for(int index1=0;index1<c.length;index1++)
			{
				if(c[index]==c[index1])
				{
					result= count++;
				}
			}
			System.out.println("Number of times " + c[index] + " repeated is" + result);
		}
	}
	

}
