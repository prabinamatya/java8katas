package com.prabin.consumers;

import java.util.function.Consumer;

import com.prabin.doubleColon.Person;

public class Consumers {
	public void operateOnSingleInputArgument() {
		Consumer<Person> greeter = (p) -> System.out.println("Hello, "
				+ p.getFirstName());
		greeter.accept(new Person("Luke", "Skywalker"));
	}
}
