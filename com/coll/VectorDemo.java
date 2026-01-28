package com.coll;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo
{
	public static void main(String[] args)
	{
		Vector v1=new Vector();
		System.out.println("DEFAULT SIZE IS::"+v1.size());
		System.out.println("DEFAULT CAPACITY IS::"+v1.capacity());
		System.out.println("DEFAULT VALUE IS::"+v1);
		
		v1.add("shifa");
		v1.add(12);
		v1.addElement("BAGWAN");
		
	
		
		System.out.println("NOW SIZE IS::"+v1.size());
		System.out.println("NOW CAPACITY IS::"+v1.capacity());
		System.out.println("NOW VALUE IS::"+v1);
		
		v1.remove(2);
		System.out.println("NOW SIZE IS::"+v1.size());
		System.out.println("NOW CAPACITY IS::"+v1.capacity());
		System.out.println("NOW VALUE IS::"+v1);
		
		Enumeration e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		System.out.println();
		
		Iterator i1=v1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
