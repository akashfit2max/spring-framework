package com.springcore.autowire;

public class Employee {

	private Address addres2;

	public Address getAddres2() {
		return addres2;
	}

	public void setAddres2(Address addres2) {
		this.addres2 = addres2;
	}

	@Override
	public String toString() {
		return "Employee [addres2=" + addres2 + "]";
	}

}
