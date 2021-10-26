package com.java8predicateexample;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample5 {

	public static void main(String[] args) {
		ArrayList<StockExample5> stockList = new ArrayList<StockExample5>();
		PredicateExample5.getStockHolding(stockList);

		Predicate<StockExample5> p = Predicate.isEqual(new StockExample5("Reliance", 15000, 5, 7500, 2));

		Function<StockExample5, Integer> fun = s -> {
			return s.TotalCost = s.TotalCost + 5;

		};

		for (StockExample5 st : stockList) {
			if (p.test(st)) {
				System.out.println(fun.apply(st));
			}
			System.out.println("found");
		}

		for (StockExample5 stock : stockList) {
			System.out.println(" Total Qty = " + stock.TotalCost);
		}
	}

	public static void getStockHolding(ArrayList<StockExample5> stockList) {
		stockList.add(new StockExample5("Reliance", 15000, 5, 7500, 2));
		stockList.add(new StockExample5("jio", 35000, 5, 7540, 2));
		stockList.add(new StockExample5("Airtel", 25000, 5, 7300, 2));
		stockList.add(new StockExample5("Idea", 65000, 4, 75200, 2));
	}

}
