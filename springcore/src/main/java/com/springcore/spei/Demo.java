package com.springcore.spei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+11}")
	private int x;

	@Value("#{2+45+34}")
	private int y;

//	calling static method T(class).method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;

//	calling static variable
	@Value("#{T(java.lang.Math).PI}")
	private double e;

//	creating a object using expression language
	@Value("#{new java.lang.String('akash kumar sahoo')}")
	private String name;

	@Value("#{1<3}")
	private boolean exp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", exp=" + exp + "]";
	}
}
