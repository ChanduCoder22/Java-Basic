package com.gl.abstractclasses;

public abstract class Shape {
	
	float param,area;
	
	// abstract method - method signature
	public abstract void computeArea(float param); // method signature
	
	// concrete method 
	public void showArea() {
		System.out.println( " Area = "  + area);
	}
}
