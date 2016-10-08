package com.agrawal.ritu.java;

public class fibonacci_number {
	public static void main(String[] args)
	{
		System.out.println("Fibonacci series till 10 to be generated : \n");
		int i=0, j=1;
		System.out.print(i+ "   "+j);
		//System.out.println(j);
		for(int count=1; count<=8; count++)
		{
			int temp = i+j;
			System.out.print("   "+temp);
			i=j;
			j=temp;
		}
		
	}

}
