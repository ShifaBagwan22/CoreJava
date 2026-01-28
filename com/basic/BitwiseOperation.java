package com.basic;

public class BitwiseOperation 
{
	public static void main(String[] args) 
	{
		int num=2;//table of 10
		int result=1;
		for(int i=1;i<=10;i++)
		{
			result=num<<(i-1);	//Bitwise left means tables
			System.out.println(result);
		}
		
//		int num=10;
//		int result=num>>2;
//		System.out.println(result);
//		
//		int no=2;
//		if((no & 1)==0)
//		{
//			System.out.println("Even number");
//		}
//		else
//		{
//			System.out.println("Odd Number");
//		}
		
	}
}
