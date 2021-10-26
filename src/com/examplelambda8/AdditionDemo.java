package com.examplelambda8;

public class AdditionDemo {

	public static void main(String[] args) {
		// java 8
		AdditionInterface ai = ( a, b) -> a+b;
		System.out.println(ai.sum(10, 20));

	}

	// java 7
	public void sum1(int c, int d) {
		int sum1 = c + d;
		System.out.println(sum1);

	}
}
