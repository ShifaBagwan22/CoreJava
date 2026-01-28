//Swap two variable without using third variable...+

package com.basic;

public class SwapWithoutVariable 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping....");
		System.out.println("The Value of a::"+a+" and b:: "+b);
	}
}
