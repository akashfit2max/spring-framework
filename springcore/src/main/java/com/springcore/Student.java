package com.springcore;

public class Student {

	private String name;
	private String id;
	private String city;

	public String getName() {
		return name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String name, String id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, id=%s, city=%s]", name, id, city);
	}

}
