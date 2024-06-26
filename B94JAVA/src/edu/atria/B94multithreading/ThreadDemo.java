package edu.atria.B94multithreading;



public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ChildThread t1=new ChildThread(5,"first");
   ChildThread t2=new ChildThread(10,"second");
   t1.start();//internally call the run() method several methods
   t2.start();
   t1.start();
   
	}

}