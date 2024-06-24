package edu.atria.B94exception;

public class AgeTest {
	
		public void validate(int age) throws IvalidAgeException{
			if(age<18) {
				
				throw new IvalidAgeException("not eligible to vote");
			}
			else
				System.out.println("vote");
			
		}

	}

