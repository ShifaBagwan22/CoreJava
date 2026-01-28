/*
 a
 a b
 a b c
 a b c d
 a b c d e
*/
package com.basic;

public class Pattern8 
{
	public static void main(String[] args) 
	{
//		for(char ch='a';ch<='e';ch++)
//		{
//			for(char j='a';j<=ch;j++)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//			
//		}
		
		
		for(int i=97;i<=101;i++)
		{
			for(int j=97;j<=i;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}
