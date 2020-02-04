package com.cg.lab3.exercise4;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter no of array elements");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		char c[] = new char[n];
		for(int index=0;index<n;index++)
		{
			c[index]=sc.next().charAt(0);
		}
		CharacterRepeat ca = new CharacterRepeat();
		ca.characterArray(c);
		sc.close();
	}

}
