package com.Thread;

public class StaticThread 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1);
		t1.setName("Shifa");
		System.out.println(t1);
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1);
		System.out.println("is alive or not..."+t1.isAlive());
	}
}
