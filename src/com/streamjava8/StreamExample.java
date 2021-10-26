package com.streamjava8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// java 7
		List<Integer> evenNum = new ArrayList<Integer>();
		for (Integer num : al) {
			if (num % 2 == 0) {
				evenNum.add(num);
			}
		}
		System.out.println("List of even number" + evenNum); 

		// java 8 using stream api
		evenNum = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("List of even number using Stream " + evenNum);
	}
			

}
