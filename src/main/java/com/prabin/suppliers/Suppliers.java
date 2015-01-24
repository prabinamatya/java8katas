package com.prabin.suppliers;

import java.util.function.Supplier;

public class Suppliers {
	/*
	 * suppliers represent a function that accepts no arguments, and produce
	 * result of some arbitrary type
	 */
	public void produceResult() {
		Supplier<User> userSupplier = User::new;
		User user = userSupplier.get();
	}
}
