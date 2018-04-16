package com.ming.demo.model;


@lombok.Getter
@lombok.Setter
@lombok.ToString
public class Person {

	private Long id;

	private String name;

	public Person() {
	}

	public Person(Long id, String name) {
		this.id = id;
		this.name = name;
	}

}
