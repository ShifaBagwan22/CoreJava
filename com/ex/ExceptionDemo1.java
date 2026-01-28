package com.ex;
import java.util.Scanner;
public class ExceptionDemo1 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int[] a=new int[5];
			for(int i=0;i<5;i++)
			{
				System.out.println("ENTER VALUE::");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("END OF PROGRAM...");
		}
	}
}
