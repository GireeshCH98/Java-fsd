package com.learning.core.Phase1PracticeProject;
//9. Writing a program in Java to verify implementation of arrays

public class Phase1SN09 
{
	public static void main(String[] args) 
	{
        // Declaring and initializing arrays
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
        String[] names = {"Alice", "Bob", "Charlie"}; // Array of strings
        double[] prices = new double[4]; // Array of doubles with size 4
        // Modifying elements of arrays
        prices[0] = 10.5;
        prices[1] = 20.75;
        prices[2] = 15.0;
        prices[3] = 30.25;
        
        // Displaying elements of arrays using loops
        System.out.println("Elements of numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");        

        System.out.println("Elements of names array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        // Accessing elements of arrays
        System.out.println("First element of numbers array: " + numbers[0]);
        System.out.println("Second element of names array: " + names[1]);
        
        System.out.println("\n");        
        System.out.println("Elements of prices array:");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
