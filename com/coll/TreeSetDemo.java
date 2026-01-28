package com.coll;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		System.out.println("DEFAULT SIZE IS::"+t1.size());
		System.out.println("DEFAULT VALUE IS:: "+t1);
		t1.add(20);
		t1.add(23);
		t1.add(57);
		t1.add(11);
		System.out.println("DEFAULT SIZE IS::"+t1.size());
		System.out.println("DEFAULT VALUE IS:: "+t1);
	}
}
