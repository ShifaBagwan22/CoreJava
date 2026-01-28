//PROGRAM TO FIND FOR ARMSTRONG NUMBER.....
package com.basic;
/*CTRL+SHIFT+QUESTION MARK
*/
public class ArmstrongDemo 
{
	public static void main(String[] args) 
	{
		int no=151;
		int rem;
		int copy=no;
		int sum=0;
		while(no>0)
		{
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(sum==copy)
		{
			System.out.println("YOUR NO IS ARMSTRONG.."+sum);
		}
		else
		{
			System.out.println("YOUR NO IS NOT AN ARMSTRONG.."+sum);
		}
		
	}
}
