package com.defaultmethodinterface;

public interface PaytmWallet {
	
	default void getBalance() {
		System.out.println("Patym  Wallet account balance is Rs-5000");
	}

}
