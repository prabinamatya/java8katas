package com.prabin.predicates;

import java.util.function.Predicate;

public class Predicates {
	public void predicatesTest() {
		Predicate<String> predicate = (s) -> s.contains("s");

		System.out.println("predicate.test " + predicate.test("mso"));
		System.out.println("predicate.negate().test "
				+ predicate.negate().test("mno"));

	}
}
