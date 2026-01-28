//PROGRAM FOR FINDING LEAP YEAR OR NOT
package com.basic;

public class Condition6 
{
	public static void main(String[] args) 
	{
		int days=365;
		if(days==366)
		{
			System.out.println("LEAP YEAR...");
		}
		else if(days==365)
		{
			System.out.println("NON LEAP YEAR....");
		}
		else if(days<365 && days>366)
		{
			System.out.println("INVALID...");
		}
		System.out.println("END OF PROGRAM...");
	}
}
