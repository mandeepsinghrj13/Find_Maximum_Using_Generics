package com.bridgelabz;
public class findMaximum 
{
	
	public static void biggesOfThree(Integer a, Integer b, Integer c)
	{
		Integer max = a; // assume x is initially the largest

	    if (b.compareTo(max) > 0)
	      max = b; // y is the largest so far

	    if (c.compareTo(max) > 0)
	      max = c; // z is the largest
		System.out.println("Maximum Number Is " + max);

	}
	
	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
		Integer a = 10;
		Integer b = 200;
		Integer c = 300;
		biggesOfThree (a,b,c);
	}

}
