package com.java8predicateexample;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {

		Predicate<Integer> p = age -> (age > 18);
		System.out.println(p.test(21));// true
		System.out.println(p.test(17));// false
	}// java 8

	/*
	 * public boolean test(Integer age) { if (age > 18) { return true; } else {
	 * return false;//its in java 7 }
	 */

	/*
	 * age ->{ if(age > 18){ return true; } else{ return false; }
	 * 
	 * 
	 */

}
