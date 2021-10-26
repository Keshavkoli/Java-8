package com.java8predicateexample;

public class StockExample5 {
	String StockName;
	int StockPrice;
	int TotalQty;
	int TotalCost;
	int ProfitAndLoss;

	public StockExample5(String stockName, int stockPrice, int totalQty, int totalCost, int profitAndLoss) {
		this.StockName = stockName;
		this.StockPrice = stockPrice;
		this.TotalQty = totalQty;
		this.TotalCost = totalCost;
		this.ProfitAndLoss = profitAndLoss;
	}

	@Override
	public String toString() {
		return "Stock [StockName=" + StockName + ", StockPrice=" + StockPrice + ", TotalQty=" + TotalQty
				+ ", TotalCost=" + TotalCost + ", ProfitAndLoss=" + ProfitAndLoss + "]";
	}

	@Override
	public boolean equals(Object obj) {
		StockExample5 other = (StockExample5) obj;
		if (StockName.equals(other.StockName) && StockPrice == other.StockPrice && TotalQty == other.TotalQty
				&& TotalCost == other.TotalCost && ProfitAndLoss == other.ProfitAndLoss)
			return true;
		else

			return false;

	}

}
