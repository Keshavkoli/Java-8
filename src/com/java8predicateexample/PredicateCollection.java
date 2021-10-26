package com.java8predicateexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCollection {

	public static void main(String[] args) {

		Predicate<Collection> p = c -> c.isEmpty();

		ArrayList<Object> al = new ArrayList<>();
		al.add("Monday");

		ArrayList<Object> al1 = new ArrayList<>();
		al1.add("Tuesday");
		
		ArrayList<Object> al2 = new ArrayList<>();
		
		System.out.println(p);// it is predicate garbage value
		System.out.println(al);// [Monday]
		System.out.println(al1);// [Tuesday]
		System.out.println("---------------");
		System.out.println(p.test(al));// false
		System.out.println(p.test(al1));// false
		System.out.println(p.test(al2));//true bcz it is providing the isEmpty method in predicate<Collection> above

	}

}
