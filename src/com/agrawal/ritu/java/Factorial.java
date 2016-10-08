package com.agrawal.ritu.java;

public class Factorial {
	public static void main(String[] args)
	{
		long fac=1;
		int number=34;
		while(number>0)
		{
			fac=fac*number;
			//System.out.println(fac);
			number--;
		}
		System.out.println(fac);
	}

}
