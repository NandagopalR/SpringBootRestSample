package com.nanda.firstexample.model;

public class PersonModel {
	
	private String id;
	private String name;
	private int age=0;

	public PersonModel(String id, String name) {
        this.id = id;
        this.name = name;
    }
	
	public PersonModel(String id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
