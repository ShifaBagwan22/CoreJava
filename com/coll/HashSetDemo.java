package com.coll;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet h1=new HashSet();
		System.out.println("DEFAULT SIZE IS::  "+h1.size());
		System.out.println("DEFAULT VALUE IS..."+h1);
		h1.add(123);
		h1.add("SHIFA");
		h1.add(23.45f);
		h1.add('S');
		System.out.println("DEFAULT SIZE IS:: "+h1.size());
		System.out.println("DEFAULT VALUE IS:: "+h1);
		h1.remove("SHIFA");
		System.out.println("DEFAULT SIZE IS:: "+h1.size());
		System.out.println("DEFAULT VALUE IS:: "+h1);
		
		Iterator i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
