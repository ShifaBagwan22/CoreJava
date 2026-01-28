package com.keyword;

class SuperDemo
{
	int no;
	String name;
	public SuperDemo() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("THIS IS SUPER DEMO...");
	}
	public void setData()
	{
		no=123;
		name="SHIFA";
	}
}
class SDemo1 extends SuperDemo
{
	int no=100;
	public SDemo1()
	{
		// TODO Auto-generated constructor stub
		super.setData();
		System.out.println("THIS IS SUPER DEMO1..");
	}
	public void display()
	{
		System.out.println("NO IS.."+no);
		System.out.println("NAME IS.."+name);
	}
}
public class SupDemo 
{
	public static void main(String[] args)
	{
		SDemo1 s1=new SDemo1();
		s1.display();
	}
}
