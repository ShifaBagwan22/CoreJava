package com.ex;

import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NO1::");
			int a=sc.nextInt();
			System.out.println("ENTER NO2::");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("DIVISION IS::"+c);
			System.out.println("END OF PROGRAM...");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
//			e.printStackTrace();
		}
		finally
		{
			System.out.println("END OF PROGRAM...");
		}
	}
}
