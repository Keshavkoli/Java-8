package com.java8predicateexample;

import java.util.function.Predicate;
//find the even numbers in the given array
public class PredicateExample2 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Predicate<Integer> even = x -> x % 2 == 0;
		Predicate<Integer> odd = x -> x % 2 != 0;

		for (int i : num) {
			if (even.test(i)) {
				System.out.println(i + " odd");
				System.out.println("----------");
			} else {
				if (odd.test(i)) {
					System.out.println(i + " even");
				}
			}
		}

		for (int n : num) {
			if (even.test(n)) {
				System.out.println(n + " odd");
			}
		}
		System.out.println("-----------");
		for (int n : num) {
			if (odd.test(n)) {
				System.out.println(n + " even");
			}
		}

		System.out.println("---------------");
		// we can print odd numbers with other method also

		for (int i : num) {
			if (even.negate().test(i)) {
				System.out.println(i + " odd");
			}
		}
	}

}
