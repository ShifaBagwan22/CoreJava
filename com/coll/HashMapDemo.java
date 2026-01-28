package com.coll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
		HashMap h1=new HashMap();
		System.out.println("DEFAULT SIZE IS:: "+h1.size());
		System.out.println("DEFAULT VALUE IS:: "+h1);
		h1.put(13, "NITESH");
		h1.put("SUJAL", "PATEL");
		h1.put(new Integer(1), new String("SHIFA"));
		System.out.println("NOW SIZE IS:: "+h1.size());
		System.out.println("NOW VALUE IS:: "+h1);
		h1.remove("SUJAL");
		System.out.println("NOW SIZE IS::" +h1.size());
		System.out.println("NOW VALUE IS:: "+h1);
	
		Set set=h1.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
//			Map.Entry me=(Map.Entry)i1.next();
//			System.out.println("KEY IS::"+me.getKey());
//			System.out.println("VALUE IS::"+me.getValue());
//			System.out.println();
			
			String[] s=i1.next().toString().split("=");
			System.out.println("KEY IS::"+s[0]);
			System.out.println("VALUE IS:: "+s[1]);
			System.out.println();
		}
	}
}
