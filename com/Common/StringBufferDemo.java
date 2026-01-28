package com.Common;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("This is Tops Technologies....");
		System.out.println("Original value is.."+s1);
		System.out.println("Original length is.."+s1.length());
//		s1.setCharAt(0, 'S');
		
//		System.out.println("Capacity is.."+s1.capacity());
		s1.insert(0, "Hii ");
		System.out.println("Now value is.."+s1);
//		System.out.println("Now value is .."+s1.length());
		s1.append("SHIFA BAGWAN");
		System.out.println("Now value is.."+s1);
//		System.out.println("Now length is.."+s1.length());
		s1.delete(0, 4);
		System.out.println("Now value is.."+s1);
//		System.out.println("Now length is.."+s1.length());
		s1.reverse();
		System.out.println("Reverse value is.."+s1);
//		s1.reverse();
		System.out.println(s1.toString().toLowerCase());
		System.out.println(s1.toString().toUpperCase());
//		System.out.println("Capacity is.."+s1.capacity());
//		
	}
}
