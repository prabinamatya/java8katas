package com.prabin.streams.constructorreference;

public class Person {

	private String name;

	private Integer age;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}
