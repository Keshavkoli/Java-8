package com.simplelambdaExample;

public class DemoExample {

	public static void main(String[] args) {
		DemoExample dd = new DemoExample();
		dd.display();// java 7

		// java 8
		IntraCom i = () -> System.out.println("hello world");
		i.display();

	}

	public void display() {
		System.out.println("Hello world");
	}

}
