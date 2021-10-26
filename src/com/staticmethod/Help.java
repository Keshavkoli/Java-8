package com.staticmethod;

public class Help implements Help1 {
	public static void main(String[] args) {
		Help h = new Help();
		h.display();
		Help h1 = new Help();
		h1.display();
		h1.display1();

	}

	public void display() {
		System.out.println("static in main method 1");
		Help1.super.display();// it we print display bcz we have given default void display in Help1 interface
	}

	public void display1() {
		System.out.println("static in main method 2");
		// Help1.super.display1(); we cannot display1 bcz we have given in interface
		// Help1 class public static void display
	}
}
