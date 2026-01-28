package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("DEFAULT VALUE IS .."+a1.size());
		System.out.println("DEFAULT SIZE IS ..."+a1);
		a1.add("SHIFA");
		a1.add(123);
		a1.add(23.45f);
		a1.add('T');
		a1.add(new Integer(100));
		
		System.out.println("NOW SIZE IS..."+a1.size());
		System.out.println("NOW VALUE IS..."+a1);
		
		a1.add("SHIFA");
		System.out.println("NOW SIZE IS.."+a1.size());
		System.out.println("NOW VALUE IS..."+a1);
		
		a1.remove("SHIFA");
		System.out.println("NOW SIZE IS.."+a1.size());
		System.out.println("NOW VALUE IS.."+a1);
		
		a1.addFirst("BAGWAN");
		a1.addLast("SHIFA");
		System.out.println();
		
		a1.removeFirst();
		a1.removeLast();
		
		System.out.println("NOW SIZE IS.."+a1.size());
		System.out.println("NOW VALUE IS..."+a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
