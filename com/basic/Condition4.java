//ELSE IF LADDER EXAMPLE
package com.basic;

public class Condition4 
{
	public static void main(String[] args) 
	{
		int a=100000,b=1000000,c=10000000;
		if(a>b && a>c)
		{
			System.out.println("A IS MAXIMUM...."+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B IS MAXIMUM...."+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("C IS MAXIMUM...."+c);
		}
		else
		{
			System.out.println("END OF PROGRAM....");
		}
	}
}
