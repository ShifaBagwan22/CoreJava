//PROGRAM TO DEMONSTRATE USER DEFINED JAGGED ARRAY
package com.oops;

import java.util.Scanner;

public class JaggedArrayUser 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROW SIZE::");
		int row=sc.nextInt();
		
//		int[][] a=new int[row][];
//		System.out.println("ENTER FIRST ROW>>>COLUMN SIZE::");
//		int col1=sc.nextInt();
//		a[0]=new int[col1];
//		
//		System.out.println("ENTER  SECOND ROW>>>>COLUMN SIZE::");
//		int col2=sc.nextInt();
//		a[1]=new int[col2];
//		
//		System.out.println("ENTER THIRD ROW>>>>COLUMN SIZE::");
//		int col3=sc.nextInt();
//		a[2]=new int[col3];
		
		int[][] a=new int[row][];
		
		for(int i=0;i<row;i++)
		{
			System.out.println("ENTER COLUMN FOR "+(i+1)+" row....");
			a[i]=new int[sc.nextInt()];
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("ENTER VALUE::");
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				a[i][j]=j+1;
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		sc.close();
	}


}
