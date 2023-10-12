package com.Multithreading;

public class A extends Thread{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("SAGAR");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		A T=new A();
		T.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("SAGAR");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
