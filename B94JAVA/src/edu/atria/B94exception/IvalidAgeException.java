package edu.atria.B94exception;

public class IvalidAgeException extends Exception {
	public IvalidAgeException(){
		super("invalid Age");
	}
   public IvalidAgeException(String message){
	   super(message);
   }

}
