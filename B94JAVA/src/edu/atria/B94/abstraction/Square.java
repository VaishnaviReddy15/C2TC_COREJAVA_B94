package edu.atria.B94.abstraction;

public class Square extends Shape{
	
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return area=side*side;
	


	}
	
}
