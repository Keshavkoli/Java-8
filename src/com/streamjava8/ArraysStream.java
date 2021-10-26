package com.streamjava8;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStream {

	public static void main(String[] args) {

		int[] s = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		IntStream is = Arrays.stream(s);
		System.out.println(is);
		System.out.println("----------------------");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> sn = Stream.of(1, 2, 3, 4, 5, 6);
		System.out.println(ss);
		System.out.println("----------------------");
		System.out.println(sn);
		// in here .distinct() is used to remove the duplicate valves
		Stream<Integer> sp = Stream.concat(ss, sn).distinct();
		sp.forEach(System.out::println);
		System.out.println("----------------------");
		System.out.println(sp);// it will print is java.util.stream.ReferencePipeline$Head@3e3abc88 in the
								// console
		System.out.println("----------------------");
		int[] s1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(s1);
		System.out.println("----------------------");
		String s2 = "abc";
		String s3 = "xyz";
		String s4 = s3.concat(s2);
		System.out.println(s4);
	}

}
