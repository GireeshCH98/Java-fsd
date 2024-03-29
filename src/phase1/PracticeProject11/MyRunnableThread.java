package phase1.PracticeProject11;
//Write a program in Java to create a thread by extending the ‘Thread’ class and by implementing the “Runnable” Interface

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
