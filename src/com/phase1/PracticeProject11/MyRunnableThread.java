package com.phase1.PracticeProject11;

public class MyRunnableThread implements Runnable
{
	public void run() 
	{
        System.out.println("Thread using implements.");
    }

	public static void main(String[] args) 
	{
		MyRunnableThread mr = new MyRunnableThread();
        Thread t = new Thread(mr);
        t.start();
	}

}