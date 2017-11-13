package com.java.learning.myoverriding;

public class Dog extends Animal{
	private String name;
	public void sound()
	{
		System.out.println("dog make there own sound bow bow ");
	}
	public String family(String name)
	{
		this.name = name;
		System.out.println("dog family name ::"+name);
		return name;
	}
}
