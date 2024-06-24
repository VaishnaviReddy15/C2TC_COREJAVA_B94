package edu.atria.B94exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try
				{
					 int x[];
					 x=new int[] {1,2,3,4};
					 System.out.println(x[5]);
		   
				}
				catch(ArrayIndexOutOfBoundsException e){
					 System.err.println("error.."+e.getMessage());
					
				}
		 
		    System.out.println("hello");
			}

	}


