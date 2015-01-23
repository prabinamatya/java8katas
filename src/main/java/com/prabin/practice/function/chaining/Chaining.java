package com.prabin.practice.function.chaining;

import java.util.function.Function;

public class Chaining {
	public void chain() {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger
				.andThen(String::valueOf);

		String finalResult = backToString.apply("345");
		System.out.println(finalResult instanceof String);
	}
}
