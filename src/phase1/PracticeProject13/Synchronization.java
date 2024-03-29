//Write a program in Java to demonstrate synchronization
package phase1.PracticeProject13;

class MessageSender
{
	public void sendmessage(String message)
	{
		System.out.println("Sender Message:" +message);
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println(message + " Sent Succesfully");
		System.out.println();
	}
	
}
class ThreadMessageSender extends Thread
{
	private String message;
	private Thread thread;
	private MessageSender messageSender;
	
	ThreadMessageSender(String msg , MessageSender sender)
	{
		message = msg;
		messageSender = sender;
	}
	
	public void run()
	{
		synchronized(messageSender)
		{
			messageSender.sendmessage(message);
		}
	}
		
}

public class Synchronization 
{
	public static void main(String args[])
	{
		MessageSender messageSender = new MessageSender();
		ThreadMessageSender sender1 = new ThreadMessageSender("Hi",messageSender);
		ThreadMessageSender sender2 = new ThreadMessageSender("Goodbye",messageSender);
		sender1.start();
		sender2.start();
		try
		{
			sender1.join();
			sender2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
		
	}
}
