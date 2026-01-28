package com.coll;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		System.out.println("DEFAULT SIZE IS::"+l1.size());
		System.out.println("DEFAULT VALUE IS::"+l1);
		l1.add("shifa");
		l1.add(123);
		l1.add('M');
		l1.add("BAGWAN");
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		l1.remove();
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		l1.addFirst("HIII");
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		l1.addLast("END");
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		l1.removeFirst();
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		l1.removeLast();
		System.out.println("NOW SIZE IS::"+l1.size());
		System.out.println("NOW VALUE IS::"+l1);
		
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
