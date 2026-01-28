package com.basic;
public class DataTypeDemo 
{
	public static void main(String[] args) 
	{
		int i1=100;  //4 byte >>>>>>>> -2^32 to +2^32
		long l1=5678467; //8 byte >>>>>>-2^64 to +2^64 -1
		byte b1=123;   //1 byte >>>>>>>>-128 to +127
		char c1='a'; //2 byte
		float f1=45.123f; //4 byte
		double d1=787878.1234;//8 byte
		boolean bb=true;//1 bit
		System.out.println("INTEGER IS :"+i1);
		System.out.println("LONG  IS :"+l1);
		System.out.println("BYTE IS :"+b1);
		System.out.println("CHAR IS :"+c1);
		System.out.println("FLOAT IS :"+f1);
		System.out.println("BOOLEAN IS :"+bb);
		System.out.println("DOUBLE IS :"+d1);

		
		//FIND SIZE OF DATATYPE
		System.out.println("<<<<<FIND SIZE OF DATATYPE>>>>>>>");
		System.out.println("INTEGER SIZE IS: "+Integer.BYTES+" size");
		System.out.println("LONG SIZE IS: "+Long.BYTES+" size");
		System.out.println("BYTE SIZE IS: "+Byte.BYTES+" size");
		System.out.println("CHAR SIZE IS: "+Character.BYTES+" size");
		System.out.println("FLOAT SIZE IS: "+Float.BYTES+" size");
		System.out.println("DOUBLE SIZE IS: "+Double.BYTES+" size");
	}
}
