package com.ex;

import java.util.Scanner;

class ATMFundEXception extends Exception
{
	double amount;
	public ATMFundEXception(double amount)
	{
		this.amount=amount;
	}
}

class ATM
{
	double  balance;
	public void deposit(double amount)
	{
		balance +=amount;
		System.out.println(amount + "  rs Deposited...");
	}
	public void withdraw(double amount) throws ATMFundEXception
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount +" rs Withdrawal successfully....");
		}
		else
		{
			double needs=amount - balance;
			throw new ATMFundEXception(needs);
		}
	}
}
public class CustomExceptionDemo 
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER AMOUNT:::");
		double amount=sc.nextDouble();
		
		a1.deposit(amount);
		
		System.out.println("ENTER WITHRAWAL AMOUNT::");
		amount=sc.nextDouble();
		
		try 
		{
			a1.withdraw(amount);
		} 
		catch (ATMFundEXception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("IF YOU ENTERED  "+e.amount+" rs more into your account then you withdrawl "+amount+" rs.");
			e.printStackTrace();
		}
	}
}
