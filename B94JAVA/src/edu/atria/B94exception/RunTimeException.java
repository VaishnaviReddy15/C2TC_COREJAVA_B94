package edu.atria.B94exception;
import java.util.Scanner;

public class RunTimeException {
	
		public static void divide(int x,int y) {
			int z;
			try {
			z=x/y;
			System.out.println("the value of z:"+z);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int x,y;
			Scanner sc=new Scanner(System.in);
	        try {
	        	System.out.println("inside the try block...");
	        	System.out.println("enter two numbers..");
	        	x=Integer.parseInt(sc.nextLine());
	        	y=Integer.parseInt(sc.nextLine());
	        	divide(x,y);
	        	
	        }catch(Exception ex) {
	        	System.err.println("invalid input");
	        }
		}

	}

