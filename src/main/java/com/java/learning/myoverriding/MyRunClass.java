package com.java.learning.myoverriding;

public class MyRunClass {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();//used to access there own methods(also)and parent class methods also
		//Animal cat = new Cat();//used to access parent class method only not for to access child class method
		//Animal dog = new Dog();
		Cat cat = new Cat();
		animal.sound();
		animal.color();
		dog.color();
		dog.sound();
		dog.family("puppy");//use Dog dog = new Dog();
		cat.color();
		cat.sound();
		cat.members(100);
	}

}
