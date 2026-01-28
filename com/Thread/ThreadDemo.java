package com.Thread;
class First extends Thread
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Thread is..."+i);
		}
		
		System.out.println("My First Thread is completed..");
	}
}
public class ThreadDemo
{
	public static void main(String[] args)
	{
		First f1=new First();
		f1.setName("Tops");
		f1.setPriority(10);
		System.out.println(f1);
		f1.start();
		System.out.println("Is alive or not..."+f1.isAlive());
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Main Thread is ..."+i);
		}
		System.out.println("My Main Thread is completed...");
		System.out.println("Is alive or not..."+f1.isAlive());
	}
}
