package com.doublecolonoperator;

//Method reference we have to methods 1-instance method reference is used in this and other one is static method reference
//Constructor reference
//if we want to use method reference then we want to use same thing that should have same type 
// to refer the argument must be same
//we can call static method by class name
//
public class DoubleColonOperator {

	public static void main(String[] args) {
		// Help d = () -> System.out.println("hello world");// lambda expression
		 //d.display();

		DoubleColonOperator dc = new DoubleColonOperator();

		Help d1 = dc::show;// it is the MethodReference
		d1.display(10);
		// d1.display1(10);

	}

	public void show(int a) {
		System.out.println("welcome to my world");// method reference
	}

	// public void display1() {
	// System.out.println("it is the display from the interface with argument int
	// a");
}
