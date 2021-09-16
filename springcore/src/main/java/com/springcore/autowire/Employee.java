package com.springcore.autowire;

public class Employee {

	private Address addres;

	@Override
	public String toString() {
		return "Employee [addres=" + addres + "]";
	}

	public Employee(Address addres) {
		super();
		this.addres = addres;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddres() {
		return addres;
	}

	public void setAddres(Address addres) {
		this.addres = addres;
	}
}
