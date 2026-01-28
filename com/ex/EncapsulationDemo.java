package com.ex;

public class EncapsulationDemo 
{
	public static void main(String[] args) 
	{
		Staff s1=new Staff();
		s1.setSid(1);
		s1.setStname("SHIFA BAGWAN");
		s1.setSubname("JAVA");
		
		System.out.println("SID IS..."+s1.getSid());
		System.out.println("SNAME IS..."+s1.getStname());
		System.out.println("SUBJECT NAME IS..."+s1.getSubname());	
	}
}
