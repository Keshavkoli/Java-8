package com.iterface.staticmethod;

public interface Intra {
	public void display();
	abstract void display1();
	
		default void display2() {
			System.out.println("hello from interface from default method");
		}
	static void display3() {
		System.out.println("Hello from interface from static void display method");
	}
	
}