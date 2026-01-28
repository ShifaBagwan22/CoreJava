/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
*/
package com.basic;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}
