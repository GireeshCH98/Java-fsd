package phase1.PracticeProject15;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			int result = 10 / 0;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Caught Exception: "+e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block Executed.");
		}
	}

}