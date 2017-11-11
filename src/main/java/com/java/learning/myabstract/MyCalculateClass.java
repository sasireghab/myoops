package com.java.learning.myabstract;

public class MyCalculateClass extends MyAbstractClass{
	private int sum;
	private int avg;
	private int div;
	public void mul(int a ,int b)
	{
		sum = a*b;
		System.out.println("calculate class");
		System.out.println(" mul input value are :: "+ "a :: "+a+"b :: "+b);
		System.out.println("mul value is :: "+sum);
	}
	
	public void div(int a,int b)
	{
		div = a/b;
		System.out.println("div value ::"+div);
	}
	
	public int avg(int m1,int m2,int m3)
	{
		int total = m1+m2+m3;
		avg = total/3;
		System.out.println("calculate class");
		System.out.println("m1 :: "+m1);
		System.out.println("m2 :: "+m2);
		System.out.println("m3 :: "+m3);
		System.out.println("total :: "+total);
		System.out.println("avg is :: "+avg);
		return avg;
	}


}
