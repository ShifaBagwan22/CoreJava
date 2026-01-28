package com.Common;

class Student
{
	public void show() {}
}
public class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("Autoboxing is.."+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is.."+i2);
		
		int b=i1.intValue();
		System.out.println("Unboxing is..."+b);
		
		String s=new String("786");
		int x=Integer.parseInt(s);
		System.out.println("Unboxing is..."+x);
		
		Object o1=new Object();
		Student s1=new Student();
		o1=i1;
		System.out.println(o1);
			
			
		
	}
}
