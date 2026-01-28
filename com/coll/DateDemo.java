package com.coll;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		System.out.println("DATE IS:: "+d1.getDate());
		System.out.println("TIME IS:: "+d1.getTime());
		System.out.println("HOUR IS:: "+d1.getHours());
		System.out.println("MINUTE IS:: "+d1.getMinutes());
		System.out.println("SECOND IS::"+d1.getSeconds());
		System.out.println("MONTH IS:: "+d1.getMonth());
		System.out.println("YEAR IS:: "+d1.getYear());
		
		SimpleDateFormat s1=new SimpleDateFormat("dd/MM/YYYY HH:MM:ss a");
		System.out.println(s1.format(d1));
		
	}
	
}
