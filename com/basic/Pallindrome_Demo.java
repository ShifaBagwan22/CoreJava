//Program to find pallindrome number
package com.basic;
public class Pallindrome_Demo 
{
	public static void main(String[] args) 
	{
		int no=121;
		int rem,sum;
		sum=0;
		int temp=no;
		while(no>0)
		{
			rem=no%10;
			sum=sum*10+rem;
			no=no/10;
		}
		if(temp==sum)
		{
			System.out.println("YOUR NUMBER IS PALLINDROME NUMBER..."+sum);
		}
		else
		{
			System.out.println("YOUR NUMBER IS NOT PALLINDROME NUMBER..."+sum);
		}
	}
}
