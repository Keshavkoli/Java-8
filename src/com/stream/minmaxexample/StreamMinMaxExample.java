package com.stream.minmaxexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(12, 34, 56, 78, 89, 45, 56, 677, 3, 70, 56, 0, 1);
		System.out.println("all numbers in a Array = " + num);
		// here we have used min method and compareTo operator

		int minValve = num.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("the min valve will print the min number = " + minValve);
		// in here get in last means get function to get the data in the print

		int minvalve = num.stream().min(StreamMinMaxExample::toShort).get();// this is another type of min method
		System.out.println(minvalve);

		System.out.println("-----------------------");
		// here we have used max method and compareTo operator

		int maxValve = num.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("the max valve will print the max number = " + maxValve);

		int maxvalve = num.stream().max(StreamMinMaxExample::toShort).get();// this is another type of max method
		System.out.println(maxvalve);
	}

	public static int toShort(Integer a, Integer b) {
		return a.compareTo(b);// this is the method for min and max to print the valve minvalve and maxvalve
	}

}
