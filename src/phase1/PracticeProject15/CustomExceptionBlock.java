package phase1.PracticeProject15;

class CustomException extends Exception
{
	public CustomException(String message)
	{
		super(message);
	}
}
public class CustomExceptionBlock
{
	public static void main(String[] args) 
	{
		try
		{
			throw new CustomException("Custom Exception Occurred");
		}
		catch(CustomException c)
		{
			System.out.println("Caught Custom Exception:" + c.getMessage());
		}
	}

}
