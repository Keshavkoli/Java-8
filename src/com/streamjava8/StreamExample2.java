package com.streamjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		List result = al.stream().map(x -> x * 2).collect(Collectors.toList());//In here we multiply each number with 2 
		System.out.println(result);
		List result1 = al.stream().map(x -> x * 3).collect(Collectors.toList());//In here we multiply each number with 3
		System.out.println(result1);

	}

}
