//Write a program in Java to demonstrate exception handling
package phase1.PracticeProject16;

class MyException extends Exception 
{
	  private String errorMessage; 

	  public MyException(String errorMessage) 
	  {
	    this.errorMessage = errorMessage;
	  }

	  @Override
	  public String toString() 
	  {
	    return "MyException Occurred: " + errorMessage;
	  }
}

class ExceptionHandling 
{
	  public static void main(String args[]) 
	  {
		  try 
		  {
		      System.out.println("Starting of try block");
		      throw new MyException("Error occurred while processing data.");
		  } 
		  catch (MyException exp) 
		  {
		      System.out.println("Catch Block");
		      System.out.println(exp); 
		  }
	  }
}