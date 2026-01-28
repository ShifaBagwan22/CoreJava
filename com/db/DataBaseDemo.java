package com.db;

import java.sql.Connection;
import java.util.Scanner;

class DB
{
	String firstname,lastname,username,password;
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRSTNAME::");
		firstname=sc.next();
		System.out.println("ENTER LASTNAME::");
		lastname=sc.next();
		System.out.println("ENTER USERNAME::");
		username=sc.next();
		System.out.println("ENTER PASSWORD::");
		password=sc.next();
		
	}
	
	public void insertData()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
public class DataBaseDemo
{
	public static void main(String[] args) 
	{
		
	}
}
