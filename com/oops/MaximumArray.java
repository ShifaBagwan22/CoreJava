//MAXIMUM VALUE THROUGH ARRAY...
package com.oops;
import java.util.Scanner;
public class MaximumArray 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("ENTER VALUE::");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.println("MAXIMUM VALUE IS "+max);
		sc.close();
	}
}
