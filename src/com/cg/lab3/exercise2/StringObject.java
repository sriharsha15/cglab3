package com.cg.lab3.exercise2;
import java.util.Scanner;
public class StringObject {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		String str[]=new String[size];
		//String str1[]=new String[size];
		for(int index=0;index<size;index++ )
		{
			str[index]=sc.next();
		}
         StringConversion obj=new StringConversion();
         obj.conversion(str,size);
         sc.close();
	}
}
