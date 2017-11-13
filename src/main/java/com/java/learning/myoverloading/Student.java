package com.java.learning.myoverloading;

public class Student {
	private  int m1,m2,m3;
	private char grade1,grade2;
	private int total,avg;
	
	public void print(int m1,int m2, int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		System.out.println("mark list :: "+m1+ " "+m2+" "+m3);
	}
	public void print()
	{
		total = m1+m2+m3;
		avg = total/3;
		System.out.println("total :: "+total);
		System.out.println("avg :: "+avg);
	} 
	public void print(char grade1,char grade2)
	{
		this.grade1 = grade1;
		this.grade2 = grade2;
		if(total <= 250)
		{
			System.out.println("grade :: "+grade2);
		}else {
			System.out.println("grade :: "+grade1);
		}
	}
	
	
	

}
