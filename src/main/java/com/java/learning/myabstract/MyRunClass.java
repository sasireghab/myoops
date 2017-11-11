package com.java.learning.myabstract;

public class MyRunClass {

	public static void main(String[] args) {

		MyCalculateClass cc = new MyCalculateClass();
		int total = cc.cal(90, 80, 87);
		System.out.println("runclass"+total);
		cc.div(100, 20);
		cc.mul(102, 307);
		cc.avg(45, 57, 78);
	}

}
