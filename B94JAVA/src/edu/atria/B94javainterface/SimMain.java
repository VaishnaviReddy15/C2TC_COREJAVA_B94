package edu.atria.B94javainterface;

public class SimMain {

	public static void main(String[] args) {


		
				// TODO Auto-generated method stub
		    //Sim s= new Sim();for sim we cannot create objects
				Sim sOne =new Jio();
				sOne.makeCall();
				sOne.sendMessage();
				
				
				Sim sTwo=new Airtel();
				sTwo.makeCall();
				sTwo.sendMessage();
				
			}

		

	}


