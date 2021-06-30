package com.bridgelabz;
public class findMaximum<T extends Comparable> 
{
	 T a, b ,c;
	
	public findMaximum(T a,T b,T c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public static void main(String[] args) 
	{		
		System.out.println("Welcome to maximum generics problems");
        Float x = 2.3f, y = 7.8f, z = 6.7f;
        String p = "apple", q = "peach", r = "banana";
        Integer m = 20, n = 42, o = 65;
        
		new findMaximum(p,q,r).max();
		new findMaximum(x,y,z).max();
		new findMaximum(o,n,m).max();

	}
	private void max() 
	{
		findMaximum.biggesOfThree(a,b,c);
	}
	
	
	
	 
	private static <T extends Comparable> void biggesOfThree(T a, T b, T c)
	{
		T max = a; // assume a is initially the largest

	    if (b.compareTo(max) > 0) {
	      max = b; // b is the largest so far
	    }
	    if (c.compareTo(max) > 0) {
	      max = c; // c is the largest
	    }
		System.out.println("Maximum Number Is " + max);

	}
}
