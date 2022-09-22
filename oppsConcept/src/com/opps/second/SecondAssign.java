package com.opps.second;

public class SecondAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());

		// Triangle area and parameter
		double a = 2.0;
		double b = 2.0;
		double c = 2.0;		
		Triangle tri = new Triangle(a,b,c);
		System.out.println("Triangle - Area: " + tri.area());
		
		double s = 4.0;
		Square squ = new Square(s);
		System.out.println("Square - Area: " + squ.area());
	}

}
