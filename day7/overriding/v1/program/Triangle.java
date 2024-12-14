//Program to define Subclass Triangle
package com.tns.ifet.day7.overriding.v1.program;

public class Triangle extends Shape {
	private double base;
	private double height;

	// Constructor for Triangle
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	// Override draw method for Triangle
	@Override
	public void draw() {
		System.out.println("Drawing a triangle with base " + base + " and height " + height);
	}

	// Override erase method for Triangle
	@Override
	public void erase() {
		System.out.println("Erasing a triangle with base " + base + " and height " + height);
	}
}