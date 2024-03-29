package com.learning.core.Phase1PracticeProject;
//Writing a program in Java to verify implementations of maps

import java.util.*;

public class Phase1SN06 
{
	 public static void main(String[] args) 
	 {
		 // HashMap example
	     Map<String, Integer> hashMap = new HashMap<>();
	     hashMap.put("Alice", 25);
	     hashMap.put("Bob", 30);
	     hashMap.put("Charlie", 35);
	     System.out.println("HashMap Example:");
	     for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	    	 System.out.println(entry.getKey() + ": " + entry.getValue());
	     }
	     System.out.println();

	     // TreeMap example
	     Map<String, Integer> treeMap = new TreeMap<>();
	     treeMap.put("Zebra", 50);
	     treeMap.put("Lion", 45);
	     treeMap.put("Elephant", 40);
	     System.out.println("TreeMap Example:");
	     for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	    	 System.out.println(entry.getKey() + ": " + entry.getValue());
	     }
	     System.out.println();

	     // LinkedHashMap example
	     Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
	     linkedHashMap.put("X-Ray", 75);
	     linkedHashMap.put("Yak", 70);
	     linkedHashMap.put("Zebra", 65);
	     System.out.println("LinkedHashMap Example:");
	     for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
	    	 System.out.println(entry.getKey() + ": " + entry.getValue());
	     }
	}
}
