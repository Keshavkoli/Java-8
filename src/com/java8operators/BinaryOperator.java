package com.java8operators;

import java.util.function.BiFunction;

public class BinaryOperator {

	public static void main(String[] args) {
			
		// BiFunction is a interface will have two input and the last one is the return type
		//BiFunction has three argument types
		BiFunction<String, String, String> f = (s1, s2) -> s1 + s2;
		System.out.println(f.apply("keshav", "koli"));//keshavkoli
		
		java.util.function.BinaryOperator<String> bi = (s1, s2) -> s1 + s2;
		System.out.println(bi.apply("kesav", "koli"));//kesavkoli
		
		
	}

}
