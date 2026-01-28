package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableDemo 
{
	public static void main(String[] args) 
	{
		DeserializableDemo d1=new DeserializableDemo();
		Address addr=d1.setDeserializableData();
		System.out.println(addr);
		
	}
	public Address setDeserializableData()
	{
		Address addr=null;
		try 
		{
			FileInputStream fis=new FileInputStream("abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			addr=(Address)ois.readObject();
			ois.close();
			fis.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return(addr);
	}
}
