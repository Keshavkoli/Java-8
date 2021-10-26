package com.primitivetypeexample;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

//In here Consumer is the interface in java.util package
//
public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<Integer> c = i -> System.out.println("the square of i:" + (i * i));
		c.accept(10);
		IntConsumer c1 = i -> System.out.println("square of i is" + (i * i));
		c1.accept(10);

		Consumer<Integer> c2 = i -> System.out.println("the square of = " + (i * i));
		c2.accept(8);
		IntConsumer cn = i -> System.out.println("the square of  " + (i * i));
		cn.accept(5);

	}

}
