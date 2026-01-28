//Program to demonstrate the user input
package com.basic;

import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
//	Scanner sc1=new Scanner(System.in);

	System.out.println("ENTER NO::");
	int no1=sc.nextInt();
//	sc.nextLine();
	
	System.out.println("ENTER NAME::");
	String name=sc.nextLine();					//next() prints only on word
	
//	System.out.println("ENTER YOUR FULL NAME::");   //First way to take another scanner object
//													//to print string
//	String name=sc1.nextLine();
	System.out.println("Your no is "+no1);
	System.out.println("Your name is "+name);
	sc.close();
//	sc1.close();
	}
}