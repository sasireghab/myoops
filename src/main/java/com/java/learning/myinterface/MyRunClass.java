package com.java.learning.myinterface;

public class MyRunClass {

	public static void main(String[] args) {
		MyInterface cal = new MyCalculations();
		cal.div(100, 10);
		cal.mul(100, 10);
		cal.sub(100, 10);
		cal.sum(100, 10);
	}

}
