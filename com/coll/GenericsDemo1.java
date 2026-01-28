package com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("SHIFA");
		s1.setCity("PALANPUR");
		s1.setDegree("BCA");
		
		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("ABCD");
		s2.setCity("AHMEDABAD");
		s2.setDegree("MCA");
		
		a1.add(s1);
		a1.add(s2);
		
		System.out.println(a1);
		
		Iterator<Student> i1=a1.iterator();
		while(i1.hasNext())
		{
			Student s=i1.next();
			System.out.println("SID IS::"+s.getSid());
			System.out.println("SNAME IS::"+s.getSname());
			System.out.println("SCITY IS::"+s.getCity());
			System.out.println("SDEGREE IS::"+s.getDegree());
		}
		
		
	}
}
