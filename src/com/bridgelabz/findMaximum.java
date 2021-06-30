package com.bridgelabz;
public class findMaximum 
{
	
	public static void biggesOfThree(String a, String b, String c)
	{
		String max = a; // assume x is initially the largest

	    if (b.compareTo(max) > 0)
	      max = b; // y is the largest so far

	    if (c.compareTo(max) > 0)
	      max = c; // z is the largest
		System.out.println("Maximum Number Is " + max);

	}
	
	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
		String a = "chandan";
		String b = "mandeep";
		String c = "kuldeep";
		biggesOfThree (a,b,c);
	}

}
