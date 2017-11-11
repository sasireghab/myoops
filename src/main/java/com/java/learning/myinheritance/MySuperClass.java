package com.java.learning.myinheritance;

public class MySuperClass {
	
	private int empid;
	private String empName;
	private int salary;
	private int tax;

	MySuperClass(int id,String name)
	{
		this.empid = id;
		this.empName = name;
		System.out.println("EMP ID IS :: "+id);
		System.out.println("EMP NAME IS :: "+name);
	}
	
	public void calSalary(int s, int t)
	{
		this.salary = s;
		this.tax = t;
	}

}
