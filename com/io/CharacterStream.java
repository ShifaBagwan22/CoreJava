package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw=new FileWriter("a2.txt");
			String s="THIS IS TOPS TECHNOLOGIES..";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("DATA WRITE....");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try 
		{
			FileReader fr=new FileReader("a2.txt");
			int x;
			while((x=fr.read()) !=-1)
			{
				System.out.print((char)x);
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
