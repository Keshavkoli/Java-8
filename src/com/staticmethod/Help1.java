package com.staticmethod;

public interface Help1 {

	default void display() {
		System.out.println("Interface static method display:");
	}

	public static void display1() {
		System.out.println("Interface static method display1");
	}
}
