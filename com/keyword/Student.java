package com.keyword;


interface Admin
{
	String aname="BAGWAN";
}
public interface Student extends Admin
{
	int srno=1;
	String sname="SHIFA";
	public void display();
}
