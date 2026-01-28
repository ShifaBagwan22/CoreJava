/*
	1
	2 1
	3 2 1
	4 3 2 1
	5 4 3 2 1
*/
package com.basic;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.println(j+" ");
			}
			System.out.println();
		}
	}
}
