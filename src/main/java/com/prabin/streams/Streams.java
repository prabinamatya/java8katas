package com.prabin.streams;

import java.util.Arrays;
import java.util.List;

public class Streams {
	public void filter() {
		List<String> stringCollection = createStrings();
		
		stringCollection.stream()
			.filter(s -> s.startsWith("a"))
			.forEach(System.out::println);
	}

	private List<String> createStrings() {
		return Arrays.asList("ddd2", "aaa2","bbb1","aaa1", "bbb3","ccc", "bbb2", "ddd1");
	}
}
