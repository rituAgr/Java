package com.agrawal.ritu.java;

public class SelectionSort {
	public static void main(String[] args)
	{
		int a[]={87,29,23,43,100,12,34,56,23};
		int len=a.length;
		for (int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
              if(a[i]>a[j])
				{
            	  int temp=a[i];
            	  a[i]=a[j];
            	  a[j]=temp;
				}
		
		}
		System.out.println("The sorted array is :");
		for (int i=0;i<len-1;i++)
			System.out.println(a[i]);
	}

}
