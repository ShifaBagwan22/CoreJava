package com.coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack s1=new Stack();
		System.out.println("DEFALUT SIZE IS::"+s1.size());
		System.out.println("DEFAULT CAPACITY IS::"+s1.capacity());
		System.out.println("DEFAULT VALUE IS::"+s1);
		s1.push("SHIFA");
		s1.push(12);
		s1.push(23.35f);
		System.out.println("NOW SIZE IS::"+s1.size());
		System.out.println("NOW CAPACITY IS::"+s1.capacity());
		System.out.println("NOW VALUE IS::"+s1);
		s1.pop();
		System.out.println("NOW SIZE IS::"+s1.size());
		System.out.println("NOW CAPACITY IS::"+s1.capacity());
		System.out.println("NOW VALUE IS::"+s1);
		
		Enumeration e1=s1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
	}
}
