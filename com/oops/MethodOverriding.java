//PROGRAM TO PERFORM METHOD OVERRIDING
package com.oops;
class First
{
	public void display()
	{
		System.out.println("THIS IS FIRST CLASS METHOD...");
	}
}
class Second extends First
{
	public void display()
	{
		System.out.println("THIS IS SECOND CLASS METHOD...");
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
//		Second s1=new Second();
//		s1.display();
		First f1=new First();
		f1.display();
		f1=new Second();
		f1.display();
	}
}
