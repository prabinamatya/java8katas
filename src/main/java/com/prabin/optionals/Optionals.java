package com.prabin.optionals;

import java.util.Optional;

public class Optionals {
	public void preventNullPE() {
		Optional<String> optional = Optional.of("bam");

		System.out.println("optional.isPresent()");
		boolean present = optional.isPresent();
		System.out.println(present);

		System.out.println("optional.get()");
		String string = optional.get();
		System.out.println(string);

		System.out.println("optional.orElse('fallback')");
		String orElse = optional.orElse("fallback");
		System.out.println("orElse = " + orElse);
		System.out.println(orElse);

		optional.ifPresent((s) -> System.out.println(s.charAt(0)));
	}
}
