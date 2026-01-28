//PROGRAM TO IMPLEMENT FINAL KEYWORD...
package com.keyword;

final class FDemo
{
	final int no=10;	//DECLARED VALUE WILL BECOME FINAL,WE CANNOT CHANGE..
	String name;
//	no=10;
	public  final void setData()//NO NEED TO MAKE CLASS AS FINAL WHEN YOU DECLARE METHOD AS FINAL.
	{
		name="SHIFA";
	}
	public void display()
	{
		System.out.println("NO IS ....."+no);
		System.out.println("NAME IS ....."+name);
	}
}
public class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo f1=new FDemo();
		f1.setData();
		f1.display();
	}
}
