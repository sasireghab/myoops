package com.java.learning.myoverriding;

public class Cat extends Animal{
	private int num;

	public void sound()
	{
		System.out.println("cat make there own sound mew mew ");
	}
	public void color()
	{
		System.out.println("cat  color  white");
	}
	public int members(int num)
	{
		this.num = num;
		System.out.println("cat members :: "+num);
		return num;
	}
}
