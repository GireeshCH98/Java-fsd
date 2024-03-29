package com.phase1.PracticeProject11;

public class MyThread extends Thread
{
	public void run() 
	{
		System.out.println("Thread using extends is running.");
	}

	public static void main(String[] args) 
	{
		MyThread t = new  MyThread();
  		t.start();
	}

}
