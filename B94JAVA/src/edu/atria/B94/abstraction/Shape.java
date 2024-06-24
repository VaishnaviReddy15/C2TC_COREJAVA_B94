package edu.atria.B94.abstraction;

public abstract class Shape {
	//abstract class has both abstract method and non abstract method
	//if there is atleast one abstract method the class itself is abstract 


		//static float area
	 float area;
	 //abstract method
	 public abstract float calculateArea();
	 //non abstract method
	 public void display()
	 {
		 System.out.println("area od  the shape:"+area);
	 }
	 
	 
	}


