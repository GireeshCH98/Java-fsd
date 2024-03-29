package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify implementations of regular expressions

import java.util.regex.*;

public class Phase1SN10 
{
	public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        
        System.out.println(text);

        // Regular expression pattern to match words starting with 't'
        String pattern = "\\bt\\w*";

        // Compile the pattern
        Pattern regex = Pattern.compile(pattern);

        // Match the pattern against the input text
        Matcher matcher = regex.matcher(text);

        // Find and print all matches
        System.out.println("Words starting with 't':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        // Using replaceAll() to replace all occurrences of 'the' with 'THE'
        String replacedText = text.replaceAll("\\bthe\\b", "THE");
        System.out.println("\nText after replacement: the");
        System.out.println(replacedText);
    }
}
