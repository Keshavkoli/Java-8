package com.defaultmethodinterface;

interface Intra {
	default void display() {
		System.out.println("Java 8 method declaration");
	}
}

