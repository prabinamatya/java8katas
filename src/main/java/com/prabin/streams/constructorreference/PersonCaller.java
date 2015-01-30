package com.prabin.streams.constructorreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PersonCaller {

	public void call() {
		/*
		 * Constructors with 0 arguments
		 */
		// Supplier<Person> x = Person::new;
		// Person p = x.get();

		/*
		 * Constructors with 2 arguments
		 */
		BiFunction<String, Integer, Person> dualArgs = Person::new;
		Person p = dualArgs.apply("Jack", 23);

		Function<String, Person> singleArgs = Person::new;
		singleArgs.apply("Test");

	}
}
