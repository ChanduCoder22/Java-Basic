package com.gl.interfaces;

public class Square implements Shape {
	int area;
	
	@Override
	public void computeArea(int param) {
		area = param * param;
	}

	@Override
	public void showArea() {
		System.out.println("Area of Square = " + area);
	}

}
