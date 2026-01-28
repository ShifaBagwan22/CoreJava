package com.keyword;

class TDemo
{
	int rno;
	String name;
	public void setData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public void display()
	{
		System.out.println("ROLL NO IS "+rno);
		System.out.println("NAME  IS "+name);
	}
}

public class ThisDemo 
{
	public static void main(String[] args) 
	{
		TDemo t1=new TDemo();
		t1.setData(10,"SHIFA");
		t1.display();
		
	}
}
