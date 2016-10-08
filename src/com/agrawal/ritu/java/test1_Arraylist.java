package com.agrawal.ritu.java;

import java.util.ArrayList;

public class test1_Arraylist {
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList();
		a.add(23);
		a.add(45);
		a.add(48);
		a.add(40);
		
		System.out.println(a);
		a.add(33);
		a.set(2,100);
		System.out.println(a);
	}

}
