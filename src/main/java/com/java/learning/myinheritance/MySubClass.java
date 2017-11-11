package com.java.learning.myinheritance;

public class MySubClass extends MySuperClass
{
	private int finalsalry;
	MySubClass(int id,String name)
	{
		super(id,name);
		
	}
	public void calSalary(int s,int t)
	{
		this.finalsalry = s - t;
		System.out.println("EMP SALARY :: "+s);
		System.out.println("EMP TAX IS :: "+t);
		System.out.println("FINAL SALARY :: "+this.finalsalry);
		
	}
	

}
