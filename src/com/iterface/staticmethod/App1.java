package com.iterface.staticmethod;

public class App1 extends Help   {
	public void test() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
	App1 a = new App1();
	a.test();
	Help h = new Help();
	h.test();
	
	}

	public static void display2() {
		System.out.println("outside the main method");
	}

}
