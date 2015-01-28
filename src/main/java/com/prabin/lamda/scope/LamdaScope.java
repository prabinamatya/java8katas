package com.prabin.lamda.scope;

public class LamdaScope {

	/*
	 * Read final local variables from the outer scope of lambda expressions
	 */
	public void readFinalLocalVariables() {
		final int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String
				.valueOf(from + num);
		String convertedString = stringConverter.convert(2);
		System.out.println("convertedString = " + convertedString);
	}
}
