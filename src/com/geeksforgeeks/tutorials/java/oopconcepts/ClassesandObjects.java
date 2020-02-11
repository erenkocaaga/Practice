package com.geeksforgeeks.tutorials.java.oopconcepts;


class Animal {
	String name; 
	int age;
}

class Dog extends Animal{
	String breed; 
	String color; 
	
	// Constructor Declaration of Class 
    public Dog(String name, String breed, 
                   int age, String color) 
    { 
        super.name = name; 
        this.breed = breed; 
        super.age = age; 
        this.color = color; 
    } 
  
    // method 1 
    public String getName() 
    { 
        return super.name; 
    } 
  
    // method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    // method 3 
    public int getAge() 
    { 
        return super.age; 
    } 
  
    // method 4 
    public String getColor() 
    { 
        return color; 
    } 
  
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + 
               this.getBreed()+"," + this.getAge()+ ","+ this.getColor()); 
    } 
	
}

public class ClassesandObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tuffy = new Dog("tuffy","papillon", 5, "white"); 
		System.out.println(tuffy);
        System.out.println(tuffy.toString());

	}

}
