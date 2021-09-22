package com.springcore.javaconfig;

//@Component

public class Student {

	private Samosa samosa;

	public Student(Samosa samosa, String name, int id) {
		super();
		this.samosa = samosa;
		this.name = name;
		this.id = id;
	}

	private String name;
	private int id;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void study() {
		System.out.println("studying");
		this.samosa.display();
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + ", name=" + name + ", id=" + id + "]";
	}

}
