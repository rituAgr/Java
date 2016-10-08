package com.agrawal.ritu.java;

public class fibonacci_recursion {
	
	static public void main(String[] args)
	{
		int n=0;
		System.out.println("Recursive fibonacci series");
		while(n<7)
		{	
		int i=recur_fibo(n);
		System.out.println(i);
		n++;
		}
	}
	public static int recur_fibo(int n)
	{   
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return (recur_fibo(n-1)+recur_fibo(n-2));
			
	}
}
