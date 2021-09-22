package com.springcore.spei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+11}")
	private int x;

	@Value("#{2+45+34}")
	private int y;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int z;

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
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

}
