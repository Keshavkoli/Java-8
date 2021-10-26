package com.lambda.java8;

public class Demo {
	public void display1() {
		System.out.println("from interface with unimplemented method public void display");
	}

	public static void main(String[] args) {
		Demo d = new Demo(); // its all about java 7
		d.display1();
		// d.display();

		// using Lambda in java 8

		Intra i = () -> System.out.println("display from the interface");
		i.display();
		i.display1();

	}

}
