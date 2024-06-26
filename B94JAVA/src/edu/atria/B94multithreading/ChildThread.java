package edu.atria.B94multithreading;


public class ChildThread extends Thread{
	int n;
	String mesg;
	
	public ChildThread(int n, String mesg) {
		super();
		this.n = n;
		this.mesg = mesg;
	}
	@Override
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(mesg + i);
		}
	}
	
}