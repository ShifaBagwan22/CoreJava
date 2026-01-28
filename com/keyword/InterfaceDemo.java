package com.keyword;

class Result
{
	String grade;
	public void setResultData()
	{
		grade="A+";
	}
}

class Sport extends Result implements Student
{
	String spname;
	public void setData()
	{
		spname="CRICKET";
	}
	@Override
	public void display() 
	{
		System.out.println("SRNO IS.."+srno);
		System.out.println("SNAME IS.."+sname);
		System.out.println("SPNAME IS.."+spname);
		System.out.println("GRADE IS.."+grade);
		System.out.println("ANAME IS.."+aname);
	}
	
}
public class InterfaceDemo 
{
	public static void main(String[] args)
	{
		Sport s1=new Sport();
		s1.setData();
		s1.setResultData();
		s1.display();
	}
}
