//PROGRAM TO DEMONSTRATE MULTILEVEL INHERITANCE
package com.oops;

class Students
{
	String sname,city,degree;
	int sid;
	public void setStudentData()
	{
		sname="SHIFA";
		city="PALANPUR";
		degree="BCA";
		sid=101;
	}
}
class Sports extends Students
{
	String spname;
	public void setSportData()
	{
		spname="BATMINTON";
	}
}
class Result extends Sports
{
	String grade="A+";
	public void display()
	{
		System.out.println("STUDENT ID IS.."+sid);
		System.out.println("STUDENT NAME IS.."+sname);
		System.out.println("STUDENT CITY IS.."+city);
		System.out.println("STUDENT DEGREE IS.."+degree);
		System.out.println("STUDENT SPORT NAME IS.."+spname);
		System.out.println("STUDENT GRADE IS.."+grade);
		
	}
}
public class MultilevelInheritance
{
	public static void main(String[] args) 
	{
		System.out.println("THIS IS MULTILEVEL INHERITANCE...");
		Result r1=new Result();
		r1.setStudentData();
		r1.setSportData();
		r1.display();
	}

}
