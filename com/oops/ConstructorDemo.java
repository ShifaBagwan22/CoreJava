//PROGRAM FOR CONSTRUCTOR OVERLOADING DEMO
package com.oops;
class Sum 
{
	int x, y;
	public Sum() // DEFAULT CONSTRUCTOR
	{
		x = 10;
		y = 20;
		System.out.println("FIRST SUM IS " + (x + y));
	}
	public Sum(int a) // SINGLE PARAMETERIZED CONSTRUCTOR
	{
		x = y = a;
		System.out.println("SECOND SUM IS " + (x + y));
	}
	public Sum(int a, int b) // MULTIPLE PARAMETERIZED CONSTRUCTOR
	{
		x = a;
		y = b;
		System.out.println("THIRD SUM IS " + (x + y));
	}
}
//	 @Override 
//	 protected void finalize() throws Throwable {  //TODO Auto-generated method stub // 
//		 super.finalize();  }
//	 }

public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		Sum sc = new Sum();
		new Sum(10);
		new Sum(10, 20);
//		System.gc();	//FIRST IT CALL FINALIZE AND THEN RELEASE VALUE

	}

}
