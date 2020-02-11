package com.geeksforgeeks.tutorials.java.oopconcepts;
/* Abstract classes and Abstract methods :
 * 
-An abstract class is a class that is declared with abstract keyword.
-An abstract method is a method that is declared without an implementation.
-An abstract class may or may not have all abstract methods. Some of them 
 can be concrete methods
-A method defined abstract must always be redefined in the subclass,thus 
 making overriding compulsory OR either make subclass itself abstract.
-Any class that contains one or more abstract methods must also be declared 
 with abstract keyword.
-There can be no object of an abstract class.That is, an abstract class can 
 not be directly instantiated with the new operator.
-An abstract class can have parametrized constructors and default constructor 
 is always present in an abstract class.

There are situations in which we will want to define a superclass that declares 
the structure of a given abstraction without providing a complete implementation 
of every method. That is, sometimes we will want to create a superclass that only 
defines a generalization form that will be shared by all of its subclasses, leaving 
it to each subclass to fill in the details.

Consider a classic “shape” example, perhaps used in a computer-aided design system 
or game simulation. The base type is “shape” and each shape has a color, size and 
so on. From this, specific types of shapes are derived(inherited)-circle, square, 
triangle and so on – each of which may have additional characteristics and 
behaviors. For example, certain shapes can be flipped. Some behaviors may be 
different, such as when you want to calculate the area of a shape. The type 
hierarchy embodies both the similarities and differences between the shapes.
 */


//Java program to illustrate the 
//concept of Abstraction 
abstract class Shape {
	String color;
	// these are abstract methods
	abstract double area();
	public abstract String toString();
	// abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	// this is a concrete method
	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;
	public Circle(String color, double radius) {

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		return "Circle color is " + super.color + "and area is : " + area();
	}
}

class Rectangle extends Shape {
	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		return length * width;
	}
	@Override
	public String toString() {
		return "Rectangle color is " + super.color + "and area is : " + area();
	}
}

public class Abstraction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
