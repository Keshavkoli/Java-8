package com.java8operators;

//it will take String and provide the Integer type output
//Function<String,String> fun1 = s1 -> s1.length();
//System.out.println(fun1.apply("hello world"));//its  CTE
import java.util.function.Function;

public class UnaryOperator {

	public static void main(String[] args) {
 
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("hello world"));

		int amount = 3;
		Function<Integer, Integer> sum = i -> i + i;// 3 + 3 = 6
		System.out.println(sum.apply(amount));

		java.util.function.UnaryOperator<Integer> un = i -> i + i;// its the UnaryOperator<Integer> interface
		System.out.println(un.apply(amount));// 3 + 3 = 6

	}

}
