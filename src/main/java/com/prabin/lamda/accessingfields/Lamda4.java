package com.prabin.lamda.accessingfields;

import com.prabin.lamda.scope.Converter;

public class Lamda4 {
	static int outerStaticNum;
	int outerNum;

	void testScopes() {

		/*
		 * Accessessing variables from anonymous inner class
		 */
		Converter<Integer, String> stringConverter1 = (from) -> {
			outerNum = 23;
			String retVal = String.valueOf(from);
			System.out.println("retVal = " + retVal);
			return retVal;
		};

		Converter<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			String returnVal = String.valueOf(from);
			System.out.println("returnVal = " + returnVal);
			return returnVal;
		};

		String convertedVal = stringConverter1.convert(45);
		System.out.println("convertedVal = " + convertedVal);

		String convert = stringConverter2.convert(56);
		System.out.println("convert = " + convert);
	}
}
