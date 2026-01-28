//PROGRAM TO IMPLEMENT ABSTRACT KEYWORD...
package com.keyword;
abstract class ADemo		//we cannot create object of abstract class
{
	int no;
	String name;
	public abstract void setData();	//cannot make body of abstract method in parent class
	public void display()
	{
		System.out.println("NO IS ..."+no);
		System.out.println("NAME IS ..."+name);
	}
}
abstract class Demo extends ADemo
{
	public void show()
	{
		System.out.println("This is Demo class Represent...");
	}
}
class Demo1 extends Demo
{
	@Override
	public void setData() 
	{
		no=123;
		name="SHIFA";	
	}
}
public class abstractDemo 
{
	public static void main(String[] args) 
	{
//		ADemo d1=new ADemo();
		Demo1 a1=new Demo1();
		a1.show();
		a1.setData();
		a1.display();	
	}
}
