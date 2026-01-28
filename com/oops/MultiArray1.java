package com.oops;

import java.util.Scanner;

public class MultiArray1 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST MATRIX VALUE::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("ENTER VALUE::");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("FIRST MATRIX IS::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("ENTER SECOND MATRIX VALUE::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("ENTER VALUE::");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("SECOND MATRIX IS::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("SUMMATION OF MATRIX IS ::");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
