package com.example.demo_test;

public class Circle extends Shape {
	
	protected double r;
	Circle(double r) {
		this.r = r;

	}
	@Override
	public double area(int a) {
		return Math.PI * r * r;
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


}

