//PROGRAM TO PERFORM ARRAY
package com.oops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo 
{
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
//		int[] a=new int[5]; //Store 5 value but start from 0 
		/*
		 * for(int i=0;i<5;i++) { a[i]=i+1; System.out.println(a[i]); }
		 */
		
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("ENTER VALUE::");
//			a[i]=sc.nextInt();
//		}
//		System.out.println("ENTERED VALUE IS::");
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		int[]arr= {12,2,3,14,25};
		print(arr);
		Arrays.sort(arr);
		print(arr);
		
		
//		sc.close();
		
	}

}
