package com.java8predicateexample;

import java.util.function.Predicate;

//.isEqual is a method 
public class PredicateExample4 {
	public static void main(String[] args) {
		String city = "mumbai";
		Predicate<String> p = Predicate.isEqual("mumbai");
		System.out.println(p.test(city));
		System.out.println("----------");
		String city1 = "pune";
		Predicate<String> p1 = Predicate.isEqual("mumbai");
		System.out.println(p.test(city1));

	}
}
