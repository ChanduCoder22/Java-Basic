package com.gl.abstractclasses;

import java.util.Scanner;

public class Rectangle extends Shape {
	float breadth;

	@Override
	public void computeArea(float length) {
		super.param = length;
		System.out.println( "Enter breadth");
		Scanner scnr = new Scanner(System.in);
		breadth = scnr.nextFloat();
		area = super.param * breadth;
		System.out.println("Area of Rectangle = " + area);
		
	}
	
}
