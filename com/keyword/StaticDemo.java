//PROGRAM TO IMPLEMENT STATIC KEYWORD..
package com.keyword;

class SDemo
{
	int no;
	static int sno;
	static class SDemo1
	{
		public static void show()
		{
			sno=4321;
			System.out.println("SNO IS ..."+sno);
		}
	}
	static
	{
		sno=123;
		System.out.println("STATIC BLOCK VARIABLE IS.."+sno);
	}
}
public class StaticDemo 
{
	public static void main(String[] args) 
	{
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		
		SDemo.SDemo1 .show();
		s1.no=10;
		s2.no=20;
		s3.no=30;
		
		System.out.println("S1 NO IS.."+s1.no);
		System.out.println("S2 NO IS .."+s2.no);
		System.out.println("S3 NO IS .."+s3.no);
		
		s1.sno=10;
		s2.sno=20;
		s3.sno=30;
		
		System.out.println("S1 NO IS.."+s1.sno);
		System.out.println("S2 NO IS .."+s2.sno);
		System.out.println("S3 NO IS .."+s3.sno);
		
	}

}
