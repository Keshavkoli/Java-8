package com.streamiterator;

import java.util.stream.Stream;

//Stream is a interface in java.util package
//in here we have the limit method to provide the limit
public class StreamIterator {

	public static void main(String[] args) {
		//Stream.iterate(1, x -> x + 1).forEach(System.out::println);
		// the above one print infinite times
		Stream.iterate(1, x -> x + 1).limit(10).forEach(System.out::println);
		for (int a = 1; a < 10; a++) {

		}
	}

}
