//Count words from string
package com.basic;

public class CountWord 
{
	public static void main(String[] args) 
	{
		int word=0;
		String s="Shifa bagwan 123 shifa bagwan";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if((ch[i]!=' ') &&(i==0 || ch[i-1]==' '))
			{
				word++;
			}
		}
		System.out.println("TOTAL WORD IS.."+word);
	}
}
