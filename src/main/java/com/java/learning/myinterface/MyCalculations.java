package com.java.learning.myinterface;

public class MyCalculations implements MyInterface{
	private int a,b;
	private int sum,mul,sub,div;
	public int sum(int a,int b) {
		this.a = a;
		this.b = b;
		sum = a+b;
		System.out.println("sum value is "+sum);
		return sum;
	}
	public int sub(int a,int b) {
		this.a = a;
		this.b = b;
		sub = a-b;
		System.out.println("sub value is "+sub);
		return sub;
	}
	public int div(int a,int b) {
		this.a = a;
		this.b = b;
		div = a/b;
		System.out.println("div value is "+div);
		return div;
	}
	public int mul(int a,int b) {
		this.a = a;
		this.b = b;
		mul = a*b;
		System.out.println("mul value is "+mul);
		return mul;
	}
	
}
