package com.java8predicateexample;

import java.util.function.Predicate;

//Q1.)find out numbers which are greater then
//Q2.)Remove all the null and empty String from array of string
//String data[] = {"Delhi",null,"mumbai",null,"lucknow"} output = Delhi.mumbai.lucknow
// .and method
//.test method
//.or method
//
public class PredicateExample3 {
	public static void main(String[] args) {

		int[] sum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Predicate<Integer> grt = x -> x > 5;
		Predicate<Integer> less = y -> y < 5;

		Predicate<Integer> even = z -> z % 2 == 0;
		Predicate<Integer> odd = n -> n % 2 != 0;

		for (int i : sum) {
			if (less.and(even).test(i)) {
				System.out.println(i);
				System.out.println(" it will print the number less than 5 and even number");
			}
		}
		System.out.println("-----------");

		for (int i : sum) {
			if (grt.and(odd).test(i)) {
				System.out.println(i);
				System.out.println("it will print the number greater then 5 and odd numbers");
			}
		}

		System.out.println();
		for (int i : sum) {
			if (less.and(odd).test(i)) {
				System.out.println(i);
				System.out.println(" it will print the number less than 5 and even number");
			}
		}
		System.out.println("-----------");

		for (int i : sum) {
			if (grt.and(even).test(i)) {
				System.out.println(i);
				System.out.println("it will print the number greater then 5 and odd numbers");
			}
		}
		System.out.println("-----------");

		for (int i : sum) {
			if (grt.or(even).test(i)) {
				System.out.println(i);
			}
		}
	}
}
