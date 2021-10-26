package com.peek.skip.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekAndSkipExample {

	public static void main(String[] args) {

		List<String> flatnum = Arrays.asList("A1", "A23", "A12", "A2", "A3", "A4", "A5", "A10", "A11", "A99", "A45",
				"A56", "A22", "A33", "A44", "A12", "A1", "A99", "A56", "B12", "B23", "C23", "C15", "C19", "C21");

		System.out.println(flatnum.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList()));
		System.out.println("-------------------------------------------------------------------------");

		List startwithA = flatnum.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());

		startwithA.forEach(System.out::println);

		System.out.println("-------------------------------------------------------------------------");
		// peek is a consumer method means it will not return anything it consumes
		// if we want to print one one element we use peek operation
		//in here peek is used for debugging

		System.out.println(flatnum.stream().filter(f -> f.startsWith("A")).peek(System.out::println).sorted().distinct()
				.skip(3).collect(Collectors.toList()));

		// here skip operation is used to skip the numbers in above example .skip(3) it
		// will take out first numbers form the list
	}

}
