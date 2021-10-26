package com.defaultmethodinterface;

public class BalanceCheck implements BankAccount, PaytmWallet, Intra {

	public static void main(String[] args) {

		BalanceCheck b = new BalanceCheck();
		b.getBalance();

	}

	@Override
	public void getBalance() {
		BankAccount.super.getBalance();
		PaytmWallet.super.getBalance();
		Intra.super.display();
	}

}