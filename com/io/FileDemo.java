package com.io;
import java.io.File;
import java.io.IOException;
class FDemo
{
	File file;
	public FDemo()
	{
		file=new File("a3.txt");
		try 
		{
			file.createNewFile();
			display();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void display()
	{
		System.out.println("Is Directory or not.."+file.isDirectory());
		System.out.println("Is File  exist or not.."+file.isFile());
		System.out.println("Can i write into it or not..."+file.canWrite());
		System.out.println("Can i read from file.."+file.canRead());
		System.out.println("Can i execute ot not.."+file.canExecute());
		System.out.println("File Name is.."+file.getName());
		System.out.println("File Path is.."+file.getPath());
		System.out.println("File Absolute Path is.."+file.getAbsolutePath());
	}
}
public class FileDemo 
{
	public static void main(String[] args)
	{
		FDemo f1=new FDemo();
	}
}
