package com.prabin.doubleColon;

public class PersonImplementation {

	public void create() {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Prabin", "Amatya");
	}
}
