package phase1.PracticeProject15;

public class ThrowDemoBlock 
{
	public static void main(String[] args) 
	{
		int age = 17;
		if(age < 18)
		{
			try
			{
				throw new ArithmeticException("UnderAge");
			}
			catch (ArithmeticException e)
			{
				System.out.println("Caught Exception: "+e.getMessage());
			}
		}
		else
		{
			System.out.println("Welcome! You are eligible.");
		}
	}
}