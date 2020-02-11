package com.geeksforgeeks.tutorials.java.oopconcepts;

class Car 
{ 
    int model, no; 
  
    // Constructor 
    Car(int model, int no) 
    { 
        this.model = model; 
        this.no = no; 
    } 
  
    // Utility method to print object details 
    void print() 
    { 
        System.out.println("no = " + no +  
                           ", model = " + model); 
    } 
} 
  
// A Wrapper over class that is used for swapping 
class CarWrapper 
{ 
   Car c; 
  
   // Constructor 
   CarWrapper(Car c)   {this.c = c;} 
} 
  
// A Class that use Car and swaps objects of Car 
// using CarWrapper 
public class SwapWrapper {

		// TODO Auto-generated method stub
		
		 // This method swaps car objects in wrappers 
	    // cw1 and cw2 
	    public static void swap(CarWrapper cw1,  
	                            CarWrapper cw2) 
	    { 
	        Car temp = cw1.c; 
	        cw1.c = cw2.c; 
	        cw2.c = temp; 
	    } 
	  
	    // Driver method 
	    public static void main(String[] args) 
	    { 
	        Car c1 = new Car(101, 1); 
	        Car c2 = new Car(202, 2); 
	        c1.print(); 
	        c2.print(); 
	        CarWrapper cw1 = new CarWrapper(c1); 
	        CarWrapper cw2 = new CarWrapper(c2); 
	        swap(cw1, cw2); 
	        cw1.c.print(); 
	        cw2.c.print(); 
	    } 

}


