package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to implement implicit and explicit type casting
public class Phase1SN01 
{
	public static void main(String[] args) {
        // Implicit Type Casting
        int intValue = 10;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Implicit casting from int to double: " + doubleValue);

        // Explicit Type Casting
        double doubleValue2 = 20.5;
        int intValue2 = (int) doubleValue2; // Explicit casting from double to int
        System.out.println("Explicit casting from double to int: " + intValue2);
    }	
}
