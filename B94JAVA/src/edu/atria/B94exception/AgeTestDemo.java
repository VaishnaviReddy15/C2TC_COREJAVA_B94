package edu.atria.B94exception;
import java.util.Scanner;

public class AgeTestDemo {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				int age;
				Scanner sc=new Scanner(System.in);
				AgeTest st=new AgeTest();
				System.out.println("enter your age");
				age=sc.nextInt();
				try {
					st.validate(age);
					
				}catch(IvalidAgeException e) {
					System.err.println("caught an exception:\n"+e.getMessage());
				}
				
				
				

			}

		
	}


