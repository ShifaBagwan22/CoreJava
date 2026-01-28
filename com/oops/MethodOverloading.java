//PRORAM TO PERFORM METHOD OVERLOADING
package com.oops;
class Addition
{
	int x,y;
	public void sum()
	{
		x=10;
		y=20;
		System.out.println("MY FIRST ADDITION IS "+(x+y));
	}
	public void sum(int a)
	{
		x=y=a;
		System.out.println("MY SECOND ADDITION IS "+(x+y));
	}
	public void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("MY THIRD ADDITION IS "+(x+y));
	}
	public void sum(float a)
	{
		x=y=(int)a;
		System.out.println("MY FOURTH ADDITION IS "+(x+y));
	}
}
public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(10);
		a1.sum(10,20);
		a1.sum(10.30f);
	}
}
