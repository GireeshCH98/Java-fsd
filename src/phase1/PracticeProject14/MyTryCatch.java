//Write a program in Java to demonstrate try and catch
package phase1.PracticeProject14;

import java.util.Scanner;

public class MyTryCatch {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter two numbers:");
      try {
          int num1 = scanner.nextInt();
          int num2 = scanner.nextInt();

          int result = divide(num1, num2);
          System.out.println("Result: " + result);
      } 
      
      catch (ArithmeticException e) {
          System.out.println("An arithmetic exception occurred: " + e.getMessage());
      } 
      
      catch (Exception e) {
          System.out.println("An error occurred: " + e.getMessage());
      }
      finally
      {
			scanner.close();
			System.out.println("Try again with new numbers");
      }
  }

  public static int divide(int dividend, int divisor) {
      return dividend / divisor;
  }
}
