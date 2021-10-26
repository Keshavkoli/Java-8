package com.streamjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleSortedOrder {
	public static void main(String[] args) {
		List<String> flatnum = Arrays.asList("A93", "A34", "A45", "A56", "A87", "g23", "G76", "a34");

		List filteredflatnum = flatnum.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());
		System.out.println(filteredflatnum);// it will take out all the A letter out

		System.out.println("----------------------------------------------------");

		List filternum = flatnum.stream().map(s -> s.toUpperCase()).filter(p -> p.startsWith("A"))
				.collect(Collectors.toList());// it will print all to uppercase starting letter starting with A
		System.out.println(filternum);

		System.out.println("----------------------------------------------------");

		// it is with using with lambda expression
		flatnum.stream().filter(s -> {
			System.out.println(s); // it will print all the numbers
			return s.startsWith("A");
		}).count();// in here count is an action filter is a lazy operation
		// to invoke any lazy operation we need action operation i.e count is a action
		// operation

		System.out.println("----------------------------------------------------");

		List filterflat = flatnum.stream().filter(h -> h.startsWith("G")).collect(Collectors.toList());
		System.out.println(filterflat);

		System.out.println("----------------------------------------------------");

		flatnum.stream().filter(f -> f.startsWith("A")).forEach(e -> System.out.println(e));
		
		// we can write like this also
		// foreach is method in java 8 which will take stream lambda expression
		// it also called terminator operator
		// foreach has return type void it is used only for print purpose
		System.out.println("--------------------------------------------------");
		flatnum.stream().map(String::toUpperCase).filter(f -> f.startsWith("A")).forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		List<Integer> sortedorder = Arrays.asList(12, 23, 34, 45, 56, 76, 1, 1, 2, 3, 4, 4, 5, 5, 67, 67, 23, 32, 12);
		System.out.println(sortedorder);
		System.out.println("--------------------------------------------------");
		System.out.println("it will print in sortedorder = "+sortedorder.stream().sorted().collect(Collectors.toList()));
		System.out.println("--------------------------------------------------");
		//in here the distinct operator will remove all the duplicate valves
			System.out.println(sortedorder.stream().sorted().distinct().collect(Collectors.toList()));

	}
}