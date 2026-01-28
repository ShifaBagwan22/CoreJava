package com.io;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo 
{
	public static void main(String[] args) 
	{
		SerializableDemo s1=new SerializableDemo();
		s1.doSerializable();
	}
	public void doSerializable()
	{
		Address addr=new Address();
		addr.setCountry("INDIA");
		addr.setCity("AHMEDABAD");
		addr.setState("GUJARAT");
		
		try 
		{
			FileOutputStream fos=new FileOutputStream("abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(addr);
			oos.flush();
			oos.close();
			fos.flush();
			fos.close();
			System.out.println("DATA WRITE...");
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
