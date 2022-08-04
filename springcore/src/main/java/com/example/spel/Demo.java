package com.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{ 25+ 11}")
	private int x;
	
	@Value("#{200>26?22:26}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(149)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double a;
	
	@Value("#{new java.lang.String('Pardeep Kumar')}")
	private String name;
	
	@Value("#{45>25}")
	private boolean b;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", b=" + b + "]";
	}

	
	
	
	
	
	
	
	
}
