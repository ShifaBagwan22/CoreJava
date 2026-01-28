package com.basic;

public class TypeConversionDemo 
{
	public static void main(String[] args) 
	{
		int i1=100; //4 byte
		long l1; //8 byte
		
		l1=i1; //IMPLICIT CONVERSION
		System.out.println("IMPLICIT IS : "+l1);
		
		int a1;//4 byte
		a1=(int)l1;
		System.out.println("EXPLICIT IS : "+a1);
		
		int c1=129;  //4 byte
		byte b1;    //1 byte
		b1=(byte)c1;
		System.out.println("EXPLICIT BYTE IS :"+b1);	
	}
}
