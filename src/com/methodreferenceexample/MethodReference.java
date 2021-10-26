package com.methodreferenceexample;

//the functional interface must have only one abstract method
//we are using method reference for static method
//method reference we are using static method reference here
public class MethodReference {

	public static void main(String[] args) {

		//MethodReferenceExample m1 = MethodReference::show;
		//m1.display();

		MethodReferenceExample m2 = MethodReference::show1;
		m2.display1(10);
	}

	public static void show() {
		System.out.println("learn more grow more");
	}
	public static void show1(int a) {
		System.out.println("static method reference for int argument");
	}

}
