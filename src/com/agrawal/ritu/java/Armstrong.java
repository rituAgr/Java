package com.agrawal.ritu.java;

public class Armstrong {
	public static void main(String[] args)
	{
		int  number=153;
		int check=0;
		int number1 = number;
		while(number1!=0)
		{
			int digit=number1%10;
			number1=number1/10;
			check=check+digit*digit*digit;
		}
		if(number==check)
			System.out.println(number+"  is a armstrong number");
		else
			System.out.println(number+"  is not a armstrong number");
		
	}

}
