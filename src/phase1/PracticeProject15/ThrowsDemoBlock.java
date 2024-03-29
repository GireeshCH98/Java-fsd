package phase1.PracticeProject15;
import java.io.IOException;

public class ThrowsDemoBlock 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			throw new IOException("An IOException occured");
		}
		catch (IOException e)
		{
			System.out.println("Caught exception:" +e.getMessage());
		}
	}

}