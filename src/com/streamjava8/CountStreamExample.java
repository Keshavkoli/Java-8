package com.streamjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStreamExample {

	public static void main(String[] args) {
		// find out the length of each String from given list
		List<String> city = Arrays.asList("Mumbai", "Delhi", "Lucknow", "pune");
		System.out.println("Input data = " + city);

		// find out the length of each String is greater than 6
		List<Integer> cityLength = city.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println(cityLength);

		// find the city length greater than 5
		List<String> filteredResult = city.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
		System.out.println(filteredResult);

		long num = city.stream().filter(s -> s.length() > 4).count();
		System.out.println("number of city whose length is greater then = " + num);

	}

}
