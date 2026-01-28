//PROGRAM TO FIND EMPLOYEE DETAILS...
package com.oops;
 
class Employee
{
	int id;
	float basic,da,hra,pf;
	String name,city;
	public void getData()
	{
		id=101;
		basic=15000;
		da=(basic*40)/100;
		pf=(basic*12)/100;
		hra=(basic*20)/100;
		name="Shifa";
		city="Palanpur";
	}
	public void display()
	{
		System.out.println("Your ID is "+id);
		System.out.println("Your name is "+name);
		System.out.println("Your city is "+city);
	}
	public float setData()
	{
		return basic+da+pf+hra;
	}
}

public class ClassDemo 
{
		public static void main(String[] args) 
		{
			Employee e1=new Employee();
			e1.getData();
			float salary=e1.setData();
			e1.display();
			System.out.println("YOUR GROSS SALARY IS :: "+salary);
		}
}
