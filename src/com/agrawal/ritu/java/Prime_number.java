package com.agrawal.ritu.java;

public class Prime_number {
	public static void main(String[] args)
	{
		int num=44, count=0;
		for(int i=1; i<=44; i++)
		{
			if(num%i==0)
				count++;
		}
		if (count==2)
			System.out.println("44 is a prime number");
		else
			System.out.println("44 is not a prime number");
	}

}
