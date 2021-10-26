package com.primitivetypeexample;

import java.util.function.ToIntFunction;

public class PrimitiveExample1 {

	public static void main(String[] args) {

		ToIntFunction<String> intfun = s -> s.length();
		System.out.println(intfun.applyAsInt("hello world"));

	}

}
