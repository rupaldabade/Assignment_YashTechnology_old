package com.opps.second;

public class Triangle implements Shape{

	private double a;
	private double b;
	private double c;
//	private double p;
	private double s;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {

//		 p = a + b + c;
		  s = (a + b + c)/2;
		  return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
