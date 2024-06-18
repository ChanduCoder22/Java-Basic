package com.gl.interfaces;

public class MainInterface {

	public static void main(String[] args) {
		Shape square = new Square();
		square.computeArea(20);
		square.showArea();
	}

}
