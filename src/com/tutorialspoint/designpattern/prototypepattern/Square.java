package com.tutorialspoint.designpattern.prototypepattern;

public class Square extends Shape {
	
	public Square(){
		type = "Square";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
