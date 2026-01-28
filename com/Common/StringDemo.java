package com.Common;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1=new String("This is Tops Technologies...");
		System.out.println("Original value is.."+s1);
		System.out.println("Original length is.."+s1.length());		//FIND LENGTH OF STRING
		System.out.println("Lowercase is.."+s1.toLowerCase());	//CONVERT INTO LOWERCASE LETTER
		System.out.println("Uppercase is..."+s1.toUpperCase());//CONVERT INTO UPPERCASE LETTER
		System.out.println("Substring is.."+s1.substring(2));//IT WILL TAKE VALUE FROM 2..
		System.out.println("Substring is.."+s1.substring(2, 4)); //ONLY DISPLAY 2 TO 4
		System.out.println("Char at is.."+s1.charAt(2));//GET SINGLE CHARACTER..
		char[] ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);	//REVERSE STRING...
		}
		System.out.println();
		System.out.println("Original value is.."+s1);
		System.out.println("Original length is.."+s1.length());	
	}
}
