package com.learning.core.Phase1PracticeProject;
//8. Write a program to create strings and display the conversion of string to StringBuffer and StringBuilder.

public class Phase1SN08 
{
	public static void main(String[] args) 
	{
        // Create a string
        String str = "Hello, world!";

        // Convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        // Convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);

        // Display original string, StringBuffer, and StringBuilder
        System.out.println("Original String: " + str);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
