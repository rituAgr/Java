package com.agrawal.ritu.java;

public class Palidrome_number {
	public static void main(String[] args)
	{
		int  number=1234321;
		int check=0;
		//ArrayList<Integer> digits = new ArrayList();
		int number1 = number;
		while(number1!=0)
		{
			int digit=number1%10;
			number1=number1/10;
			check=check*10+digit;
		}
		if(number==check)
			System.out.println(number+"  is a palidrome number");
		else
			System.out.println(number+"  is not a palidrome number");
	}

}
