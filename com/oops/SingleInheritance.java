//SINGLE INHERITANCE
package com.oops;
class Student1
{
	int sid;
	String sname,city,degree;
	public Student1()
	{
		System.out.println("This is Student1 Constructor..");
	}
	public void setStudentData()
	{
		sid=123;
		sname="SHIFA BAGWAN";
		city="PALANPUR";
		degree="BCA";
	}
}
class Sport1 extends Student1
{
	String spname,noofyear;
	public Sport1()
	{
		System.out.println("This is Sport1 Constructor");
	}
	public void setSportData()
	{
		spname="BATMINTON";
		noofyear="2years";
	}
	public void display() 
	{
		System.out.println("STUDENT ID IS...."+sid);
		System.out.println("STUDENT NAME IS...."+sname);
		System.out.println("STUDENT CITY IS...."+city);
		System.out.println("STUDENT DEGREE IS...."+degree);
		System.out.println("SPORT NAME IS...."+spname);
		System.out.println("NO OF YEAR IS...."+noofyear);
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("<<<<<<THIS IS SINGLE INHERITANCE...>>>>>>");
		Sport1 s1=new Sport1();
		s1.setStudentData();
		s1.setSportData();
		s1.display();
	}

}
