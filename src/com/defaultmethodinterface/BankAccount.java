package com.defaultmethodinterface;

public interface BankAccount {

	default void getBalance() {
	System.out.println("Total Bank Balance is 5999");
}
}
