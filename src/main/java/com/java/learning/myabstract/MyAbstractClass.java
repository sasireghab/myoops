package com.java.learning.myabstract;

public abstract class MyAbstractClass {
	
	private int m1;
	private int m2;
	private int m3;
	private int total;
	
	public abstract void mul(int a ,int b);
	
	public int cal(int m1,int m2,int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		System.out.println("abstract class");
		System.out.println("m1 :: "+m1);
		System.out.println("m2 :: "+m2);
		System.out.println("m3 :: "+m3);
		total = m1+m2+m3;
		System.out.println("total  :: "+total);
		return total;
	}

}
