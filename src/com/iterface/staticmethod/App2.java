package com.iterface.staticmethod;

public class App2 implements Intra {

	public static void main(String[] args) {
		Intra.display3();// it is from interface Intra with static void display
		// Intra.display2(); its from interface Intra with default void display giving
		// CTE
		App2.display9();
		// Intra.display(); bcz they are unimplemented methods in interface Intra we
		// cannot print display()
		// Intra.display1();bcz they are unimplemented methods in interface Intra we
		// cannot print display()1

	}

	public void display() {
		System.out.println("from interface public void display with unimplemented methods");
	}

	public void display1() {
		System.out.println("from interface abstract void display with unimplemented methods");
	}

	private static void display9() {
		System.out.println("private method for display");
	}

}
