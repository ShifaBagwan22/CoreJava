//Program to find student data
package com.oops;

class Student
{
	int rno;
	String name,city;
	public void setData()
	{
		rno=06;
		name="Shifa";
		city="Palanpur";
	}
	public void display()
	{
		System.out.println("Roll no is "+rno);
		System.out.println("Name is "+name);
		System.out.println("City is "+city);
	}
}
public class ClassDemo2
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setData();
		s1.display();
	}
}
